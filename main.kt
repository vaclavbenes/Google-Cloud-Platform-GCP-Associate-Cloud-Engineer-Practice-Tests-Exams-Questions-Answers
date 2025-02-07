import java.io.File

fun main() {
    val filePath = "/Users/vaclav.benes/Repos/utils/Google-Cloud-Platform-GCP-Associate-Cloud-Engineer-Practice-Tests-Exams-Questions-Answers/README.md"
    val file = File(filePath)
    var lines = file.readLines().toMutableList()
    var questionNumber = 1

    for (i in lines.indices) {
        if (lines[i].startsWith("###")) {
            val questionText = lines[i].substringAfter("###").trim()
            lines[i] = "### $questionNumber. $questionText"
            questionNumber++
        }
    }

    file.writeText(lines.joinToString("\n"))
    println("Updated README.md with question numbers.")
}