public class FlightManager {
    private Flight flight;
    private Passenger passenger;

    public FlightManager(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public int getWeightPerPassenger() {
        return (flight.getPlane().getWeight() / 2) / flight.getPassengers().size();
    }
}
