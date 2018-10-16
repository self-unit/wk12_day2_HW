import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall CandyFlossStall;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void before() {
        CandyFlossStall = new CandyFlossStall("Blow ya mouf out", "Annette Flannigan", "C9");
        oldVisitor = new Visitor(35, 1.78, 300);
        youngVisitor = new Visitor(4, 0.95, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Blow ya mouf out", CandyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Annette Flannigan", CandyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("C9", CandyFlossStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.20, CandyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void higherPrice() {
        assertEquals(6.30, CandyFlossStall.priceFor(oldVisitor), 0.01);
    }
}
