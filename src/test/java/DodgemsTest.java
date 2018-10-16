import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor youngVisitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Hanks Bad knee");
        youngVisitor = new Visitor(10, 1.34, 23);
    }

    @Test
    public void hasName() {
        assertEquals("Hanks Bad knee", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasLowerPrice() {
        assertEquals(2.25, dodgems.priceFor(youngVisitor), 0.01);
    }
}
