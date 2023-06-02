package ec.edu.ups.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator c = null;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        System.out.println("Test 1");
        assertEquals(4, c.addition(2, 2));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test 2");
        assertEquals(0, c.subtraction(2, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_ok() {
        System.out.println("Test 3");
        assertEquals(2, c.division(4, 0));
    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_ok() {
        System.out.println("Test 4");
        assertEquals(4, c.multiplication(2, 2));
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        c.setAns(0);
        c =null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass");
    }

}