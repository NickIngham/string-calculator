import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringCalculatorTest {
    @Test
    fun givenIHaveAnInputOf2and3_whenAddIsCalled_then5IsReturned() {
        val input = "2,3"
        val expected = 5
        val calculator = StringCalculator()

        val result = calculator.add(input)

        assertEquals(expected, result)
    }
}