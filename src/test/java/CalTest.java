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
}
