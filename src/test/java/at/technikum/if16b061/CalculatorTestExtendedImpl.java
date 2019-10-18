package at.technikum.if16b061;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTestExtendedImpl {
    CalculatorExtendedImpl calculatorExtended;

    @BeforeEach
    public void setup() { calculatorExtended = new CalculatorExtendedImpl(); }

    @Test
    public void testSumTwoParams() {
        assertEquals(7, calculatorExtended.sum(4, 3));
    }

    @Test
    public void testSumMultipleParams() {
        assertEquals(17, calculatorExtended.sum(6, 2, 5, 4));
    }
}
