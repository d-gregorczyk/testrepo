package org.sdpi.asciidoc.extension

import org.apache.logging.log4j.kotlin.Logging
import org.asciidoctor.Options
import org.asciidoctor.ast.ContentModel
import org.asciidoctor.ast.StructuralNode
import org.asciidoctor.extension.BlockProcessor
import org.asciidoctor.extension.Contexts
import org.asciidoctor.extension.Name
import org.asciidoctor.extension.Reader
import org.sdpi.asciidoc.blockId
import org.sdpi.asciidoc.model.SdpiRequirement
import org.sdpi.asciidoc.plainContext

const val BLOCK_NAME_SDPI_REQUIREMENT = "sdpi_req"

/**
 * Block processor that searches for sdpi_req blocks.
 *
 * - Checks for requirement number duplicates
 * - Stores all requirements in [RequirementsBlockProcessor.detectedRequirements] for further processing
 */
@Name(BLOCK_NAME_SDPI_REQUIREMENT)
@Contexts(Contexts.OPEN)
@ContentModel(ContentModel.COMPOUND)
class RequirementsBlockProcessor : BlockProcessor(BLOCK_NAME_SDPI_REQUIREMENT) {
    private companion object : Logging {
        val REQUIREMENT_NUMBER_FORMAT = "^r(\\d+)$".toRegex()
    }

    private val detectedRequirements = mutableMapOf<Int, SdpiRequirement>()

    /**
     * Returns all requirements that were collected by this block processor.
     *
     * Make sure to only call this function once the conversion ended as otherwise this map will be empty.
     */
    fun detectedRequirements(): Map<Int, SdpiRequirement> = detectedRequirements

    override fun process(
        parent: StructuralNode, reader: Reader,
        attributes: Map<String, Any>
    ): Any = retrieveRequirement(reader, attributes).let { requirement ->
        logger.info { "Found SDPi requirement: $requirement" }
        storeRequirement(requirement)
        createBlock(
            parent, plainContext(Contexts.SIDEBAR), mapOf(
                Options.ATTRIBUTES to attributes, // copy attributes for further processing
                ContentModel.KEY to ContentModel.COMPOUND // signify processing of a compound object
            )
        ).also {
            // make sure to separately parse contents since reader was requested by retrieveRequirement()
            // and is EOF now
            parseContent(it, requirement.asciiDocLines)
        }
    }

    private fun retrieveRequirement(reader: Reader, attributes: Map<String, Any>): SdpiRequirement {
        val matchResults = REQUIREMENT_NUMBER_FORMAT.findAll(blockId(attributes))
        val requirementNumber = matchResults.map { it.groupValues[1] }.toList().first().toInt()
        val lines = reader.readLines()
        return SdpiRequirement(
            requirementNumber,
            attributes,
            lines
        )
    }

    private fun storeRequirement(requirement: SdpiRequirement) {
        check(!detectedRequirements.containsKey(requirement.number)) {
            "SDPi requirement R'${requirement.number}' already exists".also {
                logger.error { it }
            }
        }
        detectedRequirements[requirement.number] = requirement
    }
}