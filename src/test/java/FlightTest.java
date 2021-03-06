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
        passengers = new ArrayList<Passenger>();
        flight = new Flight(plane, "L33T", "Asgard", "JFK", "08:00");
    }
    @Test
    public void shouldGetPlane() {
        assertEquals(PlaneType.BOEING212, flight.getPlane().getPlaneType());
    }

    @Test
    public void planeStartsEmpty(){
        assertEquals(0, flight.planeIsEmpty());
    }

    @Test
    public void shouldGetFlightNumber() {
        assertEquals("L33T", flight.getFlightNumber());
    }

    @Test
    public void shouldGetDestination() {
        assertEquals("Asgard", flight.getFlightDestination());
    }

    @Test
    public void shouldGetDepartureAirport() {
        assertEquals("JFK", flight.getFlightDepartureAirport());
    }

    @Test
    public void shouldGetDepartureTime() {
        assertEquals("08:00", flight.getFlightDepartureTime());
    }

    @Test
    public void shouldAddPassengersToPlaneIfSpace() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(4, flight.getPassengers().size());
    }

    @Test
    public void shouldGetNumberOfAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(1, flight.getNumberofAvailableSeats());
    }

}
