    package flightbooking;
import java.util.UUID;
import java.util.ArrayList;
public class Plane {
    MyProvider m= new MyProvider();
    private String planeId;
    private int numOfSeats;
    private String airline;
    private double fuelCapacity;
    private int manufacturingYear;
    private Seat[] seats;
    public Plane( int numOfSeats, String airline, double fuelCapacity, int manufacturingYear,String planeId) {
        this.planeId = planeId;
        this.numOfSeats = numOfSeats;
        this.airline = airline;
        this.fuelCapacity = fuelCapacity;
        this.manufacturingYear = manufacturingYear;
        this.seats = new Seat[numOfSeats];
        initializeSeats();  
    }
    public String getPlaneId() {
        return planeId;
    }
    public int getNumOfSeats() {
        return numOfSeats;
    }
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public int getManufacturingYear() {
        return manufacturingYear;
    }
    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
    public Seat[] getSeats() {
        return seats;
    }
    public ArrayList<Seat> getAvailableSeats() {
    ArrayList<Seat> availableSeats = new ArrayList<>();
    for (Seat seat : this.seats) {
        if (!seat.isOccupied()) {
            availableSeats.add(seat);
        }
    }
    return availableSeats;
}
   public void initializeSeats() {
    for (int i = 0; i < numOfSeats; i++) {
        seats[i] = new Seat(this.planeId);
        m.addNewSeat(seats[i]);
}
}
}