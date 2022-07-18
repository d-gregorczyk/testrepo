import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.options.validate
import com.github.ajalt.clikt.parameters.types.file
import org.asciidoctor.Asciidoctor
import org.asciidoctor.Options
import org.asciidoctor.SafeMode
import java.io.File

fun main(args: Array<String>) = PublishSdpi().main(args)

class PublishSdpi : CliktCommand("publish-sdpi") {
    private val adocInputFile by option("--input-file", help = "path to ascii doc input file")
        .file()
        .required()
        .validate {
            require(it.exists()) { "Input file '$it' does not exist." }
        }

    override fun run() {
        val inputFile = adocInputFile

        println("Start conversion of ${inputFile.absolutePath}")

        val options = Options.builder()
            .safe(SafeMode.UNSAFE)
            .backend("pdf")
            .toFile(File("../output.pdf"))
            .build()

        val asciidoctor = Asciidoctor.Factory.create()
        asciidoctor.requireLibrary("asciidoctor-diagram");
        asciidoctor.convertFile(inputFile, options)

        asciidoctor.shutdown()
    }
}

