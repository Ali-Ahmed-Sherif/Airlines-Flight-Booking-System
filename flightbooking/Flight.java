package flightbooking;
 import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.time.Duration;
public abstract class Flight { 
    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;
    MyProvider m= new MyProvider();
    private int numberOfBags;
    private double totalWeight;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private String plane;
    //private ArrayList<Ticket> tickets;
    /*public Flight() {
        tickets = new ArrayList<>();
    }*/
    public Flight(String flightNumber,String departureAirport, String destinationAirport, String departureTime, String arrivalTime, String planeid, int numberOfBags, double totalWeight) {
    this.flightNumber = flightNumber;
    this.departureAirport = departureAirport;
    this.numberOfBags = numberOfBags;
    this.totalWeight = totalWeight;
    this.destinationAirport = destinationAirport;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
    this.plane = planeid;
    //tickets = new ArrayList<>();
}
    public int getNumberOfBags() {
        return numberOfBags;
    }
    public String getPlaneid() {
        return this.plane;
    }
    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
    public double getTotalWeight() {
        return totalWeight;
    }
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getDepartureAirport() {
        return departureAirport;
    }
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }
    public String getDestinationAirport() {
        return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public Plane getPlane() {
        return m.SearchbyPlaneId(plane);
    }
   /* public ArrayList<Ticket> getTickets() {
        return tickets;
    }   
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }*/
    public abstract double calculatenumBaggageFee();
    public abstract double calculateweightBaggageFee();
    public abstract double totalBaggageFee();
    public String calculateDuration() {
         Duration duration = Duration.between(LocalDateTime.parse(this.departureTime, formatter), LocalDateTime.parse(this.arrivalTime, formatter));
        long days = duration.toDays();
        duration = duration.minusDays(days);
        long hours = duration.toHours();
        duration = duration.minusHours(hours);
        long minutes = duration.toMinutes();
        duration = duration.minusMinutes(minutes);
        long seconds = duration.getSeconds();
        return "Duration: " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds";
}

}