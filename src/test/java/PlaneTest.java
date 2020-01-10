import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING212);
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(80000, plane.getWeight());
    }
}
