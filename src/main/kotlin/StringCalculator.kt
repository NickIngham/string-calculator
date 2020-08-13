class StringCalculator {
    fun add(numbers: String): Int {
        return numbers.split(',','\n')
            .sumBy { it.toInt() }
    }
}