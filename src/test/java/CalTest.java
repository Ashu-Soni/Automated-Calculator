import SciCalculator.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalTest {
    calculator cal = new calculator();

    @Test
    public void sqrt_test(){
        assertEquals("Positive Testing for squart root funcition", 2.0, cal.sqrt(4), 0);
        assertNotEquals("Negative Testing for squart root function", 4.0, cal.sqrt(25), 0);
    }

    @Test
    public void factorial_test(){
        assertEquals("Positive Testing for factorial funcition", 120.0, cal.factorial(5), 0);
        assertNotEquals("Negative Testing for factorial function", 20.0, cal.factorial(4), 0);
    }

    @Test
    public void natural_test(){
        assertEquals("Positive Testing for natural log funcition", 2.302585092994046, cal.natural_log(10), 0);
        assertNotEquals("Negative Testing for natural log function", 5.0, cal.natural_log(5), 0);
    }

    @Test
    public void power_test(){
        assertEquals("Positive Testing for power funcition", 9.0, cal.power(3, 2), 0);
        assertNotEquals("Negative Testing for power function", 10.0, cal.power(5, 2), 0);
    }
}
