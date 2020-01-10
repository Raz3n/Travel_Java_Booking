import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Passenger passenger;
    private Plane plane;
    private Flight flight;

    @Before
    public void before () {
        plane = new Plane(PlaneType.BOEING212);
        passenger = new Passenger("Dan", 2);
        flight = new Flight(plane, "L33T", "Metropolis", "Gotham", "09:00");
        flightManager = new FlightManager(flight, passenger);
    }

    @Test
    public void shouldCalculateWeightAllowedPerPassenger() {
        flight.addPassenger(passenger);
        assertEquals(8000, flightManager.getWeightPerPassenger());
    }
}
