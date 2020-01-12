public class FlightManager {
    private Flight flight;
    private Passenger passenger;

    public FlightManager(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public int getWeightPerPassenger() {
        //math for me 80000 / 2 = 40000 / passengers (bags 5) = 8000;
        return (flight.getPlane().getWeight() / 2) / flight.getPassengers().size();
    }
}
