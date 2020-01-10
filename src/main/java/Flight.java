import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, ArrayList<Passenger> passengers, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return this.plane;
    }
}
