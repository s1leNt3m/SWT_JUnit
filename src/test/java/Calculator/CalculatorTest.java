package Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

public class CalculatorTest {
    @Disabled
    @Test
    public void add() {
        assertEquals(8, Calculator.add(4, 4));
    }

    @DisplayName("Testcase for Multiplication")
    @RepeatedTest(value=3, name= LONG_DISPLAY_NAME)
    public void multiply() {

        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}