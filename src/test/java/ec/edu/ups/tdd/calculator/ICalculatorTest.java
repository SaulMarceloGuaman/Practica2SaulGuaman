package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2, 3)).thenReturn(5);
        assertEquals(5, c.addition(2, 3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.subtraction(5, 3)).thenReturn(2);
        assertEquals(2, c.subtraction(5, 3));
    }
}