import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Licky-Licky five dollars", "Bernard Germain", "W14");
        oldVisitor = new Visitor(35, 1.78, 300);
        youngVisitor = new Visitor(4, 0.95, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Licky-Licky five dollars", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Bernard Germain", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("W14", iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void higherPrice() {
        assertEquals(4.20, iceCreamStall.priceFor(oldVisitor), 0.01);
    }
}
