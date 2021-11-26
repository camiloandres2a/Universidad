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



}
