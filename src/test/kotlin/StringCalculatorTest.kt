import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.Exception

internal class StringCalculatorTest {
    @Test
    fun givenIHaveAnInputOf2and3_whenAddIsCalled_then5IsReturned() {
        val numbers = "2,3"
        val expected = 5
        val calculator = StringCalculator()

        val result = calculator.add(numbers)

        assertEquals(expected, result)
    }

    @Test
    fun givenIHaveAnInputOf2Numbers_whenAddIsCalled_thenTheSumIsReturned() {
        val numbers = "14,5"
        val expected = 19
        val calculator = StringCalculator()

        val result = calculator.add(numbers)

        assertEquals(expected, result)
    }

    @Test
    fun givenIHaveAnInputOfNumbers_whenAddIsCalled_thenTheSumIsReturned() {
        val numbers = "14,5,42,32,67"
        val expected = 160
        val calculator = StringCalculator()

        val result = calculator.add(numbers)

        assertEquals(expected, result)
    }

    @Test
    fun givenIHaveAnInputSeparatedByLineBreaksAndCommas_whenAddIsCalled_thenTheSumIsReturned() {
        val numbers = "14,5\n42,32\n67"
        val expected = 160
        val calculator = StringCalculator()

        val result = calculator.add(numbers)

        assertEquals(expected, result)
    }

    @Test
    fun givenIHaveAnInputAndDelimiterIsSpecifiedAtTheStart_whenAddIsCalled_thenTheSumIsReturned() {
        val numbers = "//;\n14;5;42;32;67"
        val expected = 160
        val calculator = StringCalculator()

        val result = calculator.add(numbers)

        assertEquals(expected, result)
    }

    @Test
    fun givenIHaveNegativeNumbers_whenAddIsCalled_thenAnExceptionIsThrownSpecifyingTheNegativeNumbers() {
        val numbers = "14,-5,42,-32,67"
        val expectedMessage = "The array contains these negative Numbers: [-5, -32]"
        val calculator = StringCalculator()

       val exception = assertThrows(Exception::class.java) {calculator.add(numbers)}

        assertEquals(expectedMessage, exception.message)
    }

}