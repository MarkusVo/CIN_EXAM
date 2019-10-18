package at.technikum.if16b061;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorFactoryTest {

    CalculatorFactory calculatorFactory;

    @BeforeEach
    public void setup() { calculatorFactory = new CalculatorFactory(); }

    @Test
    @Tag("integrationTest")
    public void integrationTestSimpleSum() {
        assertEquals(9, calculatorFactory.getCalculator(false).sum(2, 3, 4));
    }

    @Test
    @Tag("integrationTest")
    public void integrationTestSimpleException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorFactory.getCalculator(true).sum(2, 3, 4));
    }
}
