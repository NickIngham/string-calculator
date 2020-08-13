import java.lang.Exception

class StringCalculator {
    fun add(input: String): Int {
        if (input.contains("//")) {
            val splitInput = input.split('\n')
            val delimiter = getDelimiter(splitInput)
            return sum(splitInput[1].split(delimiter).map { it.toInt() })
        }
        return sum(input.split(',', '\n').map { it.toInt() })
    }

    private fun getDelimiter(splitInput: List<String>): Char =
        splitInput
            .first()
            .replace("//", "")
            .first()

    private fun sum(numbers: List<Int>): Int {
        val negativeNumbers = numbers.filter { it < 0 }
        negativeNumbers.takeUnless { it.isNotEmpty() }
            ?: throw Exception("The array contains these negative Numbers: $negativeNumbers")
        return numbers.sum()
    }


}