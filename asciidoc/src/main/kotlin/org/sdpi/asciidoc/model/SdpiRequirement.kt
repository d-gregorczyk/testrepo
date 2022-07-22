package org.sdpi.asciidoc.model

data class SdpiRequirement(
    val number: Int,
    val asciiDocAttributes: Map<String, Any>,
    val asciiDocLines: List<String>
)