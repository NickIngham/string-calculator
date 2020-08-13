class StringCalculator {
    fun add(input: String): Int {
        if (input.contains("//")) {
            val splitInput = input.split('\n')
            val delimiter = getDelimiter(splitInput)
            return add(splitInput[1], delimiter)
        }
        return input.split(',', '\n')
            .sumBy { it.toInt() }
    }

    private fun getDelimiter(splitInput: List<String>): Char =
        splitInput
            .first()
            .replace("//", "")
            .first()

    private fun add(numbers: String, delimiter: Char) =
        numbers.split(delimiter)
            .sumBy { it.toInt() }
}