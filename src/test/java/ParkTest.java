import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Dude Chilling Park");
    }

    @Test
    public void hasName() {
        assertEquals("Dude Chilling Park", park.getName());
    }
}