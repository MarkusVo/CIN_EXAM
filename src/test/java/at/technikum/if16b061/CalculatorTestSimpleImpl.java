package at.technikum.if16b061;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTestSimpleImpl {
    CalculatorSimpleImpl calculatorSimple;

    @BeforeEach
    public void setup() { calculatorSimple = new CalculatorSimpleImpl(); }

    @Test
    public void testSumTwoParams() {
        assertEquals(5, calculatorSimple.sum(2, 3));
    }

    @Test
    public void testSumException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorSimple.sum(2, 3, 4));
    }
}
