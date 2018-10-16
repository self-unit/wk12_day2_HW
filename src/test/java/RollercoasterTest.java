import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster();
    }

    @Test
    public void hasName() {
        assertEquals("Rollercoaster", rollercoaster.getName());
    }
}