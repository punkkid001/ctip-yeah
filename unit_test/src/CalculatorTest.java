import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator c = new Calculator();
        double result = c.sum(10, 50);
        assertEquals(60, result, 0);
    }
}