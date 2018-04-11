import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.temporal.JulianFields;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTest
{
    private JUnit unit;
    @BeforeEach
    void setUp()
    {
        this.unit = new JUnit();
    }

    @AfterEach
    void tearDown()
    {
        this.unit = null;
    }

    @Test
    void junit_int()
    {
        assertNotNull(this.unit.junit_int(3));
    }
}