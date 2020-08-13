class StringCalculator {
    fun add(numbers: String): Int {
        val numbersList = numbers.split(',').map { it.toInt() }
        var sum = 0
        for (i in 0..1){
            sum += numbersList[i]
        }
        return sum
    }
}