import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

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
}