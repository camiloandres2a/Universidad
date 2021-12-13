import calculator.*;
import junit.framework.TestCase;
import org.junit.Test;



public class CalculatorTest extends TestCase{

    @Test
    public void testSum(){
        Sum object1 = new Sum();
        assertEquals(3, object1.Sum(2, 1));
    }

    @Test
    public void testSubstraction(){
        Subtraction object1 = new Subtraction();
        assertEquals(1, object1.subtraction(2, 1));
    }

    @Test
    public void testMultiplication(){
        Multiplication object1 = new Multiplication();
        assertEquals(2, object1.multiplication(2, 1));
    }

    @Test
    public void testDivision(){
        Division object1 = new Division();
        assertEquals(2, object1.division(2, 1));
    }

    @Test
    public void testDivision1(){
        Division object1 = new Division();
        assertEquals("∞", object1.division(2, 0));
    }

    @Test
    public void testPow(){
        Pow object1 = new Pow();
        assertEquals(4, object1.power(2, 2));
    }

    @Test
    public void testPow1(){
        Pow object1 = new Pow();
        assertEquals(1, object1.power(27136712, 0));
    }

    @Test
    public void testSin(){
        Sin object1 = new Sin();
        assertEquals(0.1411200080598672, object1.Sin(3));
    }

    @Test
    public void testCos(){
        Cos object1 = new Cos();
        assertEquals(-0.6536436208636119, object1.Cos(4));
    }

    @Test
    public void testTan(){
        Tan object1 = new Tan();
        assertEquals(1.1578212823495775, object1.Tan(4));
    }

    @Test
    public void testPI(){
        Pi object1 = new Pi();
        assertEquals(6.283185307179586, object1.Pi(2));
    }

    @Test
    public void testFactorial(){
        Factorial object1 = new Factorial();
        assertEquals(6, object1.Factorial(3));
    }

}
