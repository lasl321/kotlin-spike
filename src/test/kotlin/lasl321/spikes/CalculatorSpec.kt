package lasl321.spikes

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals
import kotlin.test.assertTrue

object CalculatorSpec : Spek({
    given("a calculator") {
        val calculator = SampleCalculator()
        on("addition") {
            val sum = calculator.sum(2, 4)
            it("should return the result of adding the first number to the second number") {
                assertEquals(6, sum)
            }

            it("foo") {
                assertTrue { true }
            }
        }
        on("subtraction") {
            val subtract = calculator.subtract(4, 2)
            it("should return the result of subtracting the second number from the first number") {
                assertEquals(2, subtract)
            }
        }
    }
})

