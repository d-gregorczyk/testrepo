import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.options.validate
import com.github.ajalt.clikt.parameters.types.file
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.core.config.Configurator
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory
import org.apache.logging.log4j.kotlin.Logging
import org.asciidoctor.Asciidoctor
import org.asciidoctor.Options
import org.asciidoctor.SafeMode
import org.sdpi.asciidoc.extension.RequirementsBlockProcessor
import java.io.File

fun main(args: Array<String>) = args.let {
    when (System.getenv().containsKey("CI")) {
        true -> PublishSdpi().main(args.firstOrNull()?.split(" ") ?: listOf())
        false -> PublishSdpi().main(args)
    }
}

class PublishSdpi : CliktCommand("publish-sdpi") {
    private companion object : Logging

    // for some reason, github actions do not digest double quotes correctly right now - requires hard coded config
    private val adocInputFile by option("--input-file", help = "path to ascii doc input file").file().required()
        .validate {
            require(it.exists()) { "Input file '$it' does not exist." }
        }

    private val outputFolder by option("--output-folder", help = "path to artifact doc output folder").file().required()
        .validate {
            require(it.parentFile.exists()) { "Output parent folder '${it.parentFile.absolutePath}' does not exist." }
            if (!it.exists()) {
                require(it.mkdir()) { "Output folder '${it.absolutePath}' could not be created" }
            }
        }

    private val backend by option("--backend", help = "'pdf' (default) or 'html' to generate output accordingly")
        .default("pdf")
        .validate {
            require(it == "pdf" || it == "html") {
                "Backend needs to be pdf or html, but is: $it"
            }
        }

    override fun run() {
        Configurator.initialize(ConfigurationBuilderFactory.newConfigurationBuilder().let {
            it.newRootLogger(Level.INFO)
            it
        }.build(true))



        logger.info { "Start conversion of '${adocInputFile.canonicalPath}'" }

        val outFile = File(
            outputFolder.absolutePath + File.separator + adocInputFile.nameWithoutExtension + ".$backend"
        )

        logger.info { "Write output to '${outFile.canonicalPath}'" }

        val options = Options.builder()
            .safe(SafeMode.UNSAFE)
            .backend(backend)
            .toFile(outFile).build()

        val asciidoctor = Asciidoctor.Factory.create()

        asciidoctor.javaExtensionRegistry().block(RequirementsBlockProcessor())

        asciidoctor.requireLibrary("asciidoctor-diagram") // enables plantuml
        asciidoctor.convertFile(adocInputFile, options)
        asciidoctor.shutdown()

        logger.info { "File successfully written" }
    }
}

