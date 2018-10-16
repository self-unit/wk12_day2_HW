import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor oldVisitor;
    Visitor youngVisitor;

    @Before
    public void before(){
        playground = new Playground();
        oldVisitor = new Visitor(35, 1.78, 300);
        youngVisitor = new Visitor(8, 1.20, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Playground", playground.getName());
    }

    @Test
    public void canVisit() {
        assertEquals(true, playground.isAllowedTo(youngVisitor));
    }

    @Test
    public void cantVisit() {
        assertEquals(false, playground.isAllowedTo(oldVisitor));
    }
}