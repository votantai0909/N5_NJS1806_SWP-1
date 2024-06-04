import org.example.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvFileSource(resources = "/add.csv", numLinesToSkip = 1)
    void testAddition(double a, double b, double result) {
        assertEquals(calculator.add(a, b), result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/subtract.csv", numLinesToSkip = 1)
    void testSubtraction(double a, double b, double result) {
        assertEquals(calculator.subtract(a, b), result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multiplication.csv", numLinesToSkip = 1)
    void testMultiplication(double a, double b, double result) {
        assertEquals(calculator.multiply(a, b), result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/divide.csv", numLinesToSkip = 1)
    void testDivision(double a, double b, String result) throws Exception {
        if (b == 0) {
            Exception exception = assertThrows(Exception.class, () -> calculator.divide(a, b));
            assertEquals(exception.getMessage(), result);
        } else {
            assertEquals(calculator.divide(a, b), Double.parseDouble(result));
        }
    }

}