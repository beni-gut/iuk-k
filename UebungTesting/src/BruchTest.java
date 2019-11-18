import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class BruchTest {

    @Test
    public void testBruch() {
        Bruch b = new Bruch(1,5);

        assertEquals(1,b.getZaehler());
        assertEquals(5,b.getNenner());
    }

    @Test
    public void testAdd() {
        Bruch b1 = new Bruch(2,5);
        Bruch b2 = new Bruch(5,6);

        Bruch bTot = b1.add(b2);

        assertEquals(37, bTot.getZaehler());
        assertEquals(30, bTot.getNenner());
    }

    @Test
    public void testMul() {
        Bruch b1 = new Bruch(2,5);
        Bruch b2 = new Bruch(5,6);

        Bruch bTot = b1.mul(b2);

        assertEquals(1, bTot.getZaehler());
        assertEquals(3, bTot.getNenner());
    }

    @Test
    public void testGetZaehler() {
        Bruch b = new Bruch(7,5);

        assertEquals(7,b.getZaehler());
    }

    @Test
    public void testGetNenner() {
        Bruch b = new Bruch(7,43);

        assertEquals(43,b.getNenner());
    }
}
