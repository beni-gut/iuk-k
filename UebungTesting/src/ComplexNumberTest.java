import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ComplexNumberTest {

    @Test
    public void testComplexNumber() {
        ComplexNumber c = new ComplexNumber();

        assertEquals(0.0, c.getReal());
        assertEquals(0.0, c.getImaginary());
    }

    @Test
    public void testComplexNumberDoubleDouble() {
        ComplexNumber c = new ComplexNumber(5.0,-4.0);

        assertEquals(5.0, c.getReal());
        assertEquals(-4.0, c.getImaginary());
    }

    @Test
    public void testAdd() {
        ComplexNumber c1 = new ComplexNumber(2.0, 5.0);
        ComplexNumber c2 = new ComplexNumber(-3.0, 4.0);
        ComplexNumber sum = c1.add(c2);

        assertEquals(-1.0, sum.getReal());
        assertEquals(9, sum.getImaginary());
    }

    @Test
    public void testAbs() {
        ComplexNumber c = new ComplexNumber(3,4);

        assertEquals(5.0, c.abs());
    }

    @Test
    public void testToString() {
        ComplexNumber c1 = new ComplexNumber(2.0, 3.0);
        assertEquals("2.0+3.0i", c1.toString());

        ComplexNumber c2 = new ComplexNumber(2.0, -3.0);
        assertEquals("2.0-3.0i", c2.toString());
    }
}
