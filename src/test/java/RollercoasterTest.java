import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor tallVisitor;
    Visitor shortVisitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster();
        tallVisitor = new Visitor(25, 2.15, 65);
        shortVisitor = new Visitor(65, 1.39, 80);
    }

    @Test
    public void hasName() {
        assertEquals("Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void canRide() {
        assertEquals(true, rollercoaster.isAllowedTo(tallVisitor));
    }

    @Test
    public void cantRide() {
        assertEquals(false, rollercoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void hasToPayDouble() {
        assertEquals(16.80, rollercoaster.priceFor(tallVisitor), 0.01);
    }
}