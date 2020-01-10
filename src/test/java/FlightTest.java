import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private ArrayList<Passenger> passengers;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING212);
        passenger1 = new Passenger("Dan", 2);
        passenger2 = new Passenger("Tango", 1);
        passenger3 = new Passenger("Martin", 2);
        passenger4 = new Passenger("Joe", 2);
        flight = new Flight(plane, passengers, "L33T", "Asgard", "JFK", "08:00");
    }
    @Test
    public void shouldGetPlane() {
        assertEquals(PlaneType.BOEING212, flight.getPlane().getPlaneType());
    }

    @Test
    public void shouldGetFlightNumber() {
        assertEquals("L33T", flight.getFlightNumber());
    }

    @Test
    public void shouldGetDestination() {
        assertEquals("Asgard", flight.getFlightDestination());
    }



}
