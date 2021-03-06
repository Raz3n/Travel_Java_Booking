import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getFlightDestination() {
        return this.destination;
    }

    public String getFlightDepartureAirport() {
        return this.departureAirport;
    }

    public String getFlightDepartureTime() {
        return this.departureTime;
    }

    public int planeIsEmpty() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public int getNumberofAvailableSeats() {
        ArrayList<Passenger> takenSeats = new ArrayList<Passenger>();
        int freeSeats = this.plane.getCapacity();
        for (Passenger passenger : this.passengers) {
            takenSeats.add(passenger);
        }
        return freeSeats -= takenSeats.size();
    }
}
