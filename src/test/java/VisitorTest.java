import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(23, 1.78, 65.00);
    }

    @Test
    public void hasAge() {
        assertEquals(23, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.78, visitor.getHeight(), 0.01);
    }

    @Test
    public void hasMoney() {
        assertEquals(65.00, visitor.getMoney(), 0.01);
    }
}
