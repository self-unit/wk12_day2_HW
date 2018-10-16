import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccostall;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void before() {
        tobaccostall = new TobaccoStall("Hacky McHackface's Smoke Hole", "Loretta Johnson", "E24");
        oldVisitor = new Visitor(35, 1.78, 300);
        youngVisitor = new Visitor(8, 1.20, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Hacky McHackface's Smoke Hole", tobaccostall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Loretta Johnson", tobaccostall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("E24", tobaccostall.getParkingSpot());
    }

    @Test
    public void cantBuy() {
        assertEquals(false, tobaccostall.isAllowedTo(youngVisitor));
    }

    @Test
    public void canBuy() {
        assertEquals(true, tobaccostall.isAllowedTo(oldVisitor));
    }
}
