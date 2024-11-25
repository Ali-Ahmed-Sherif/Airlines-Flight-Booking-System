package flightbooking;
import java.util.UUID;
public class Ticket {
private String seatno;
private String Flightno;
private int passportno;
private String planedid;
private String ticketno;

MyProvider m=new MyProvider();
    public Ticket(String seatno, String Flightno, int passportno, String planedid) {
        //creation constructor
        this.seatno = seatno;
        this.Flightno = Flightno;
        this.passportno = passportno;
        this.planedid = planedid;
        this.ticketno =  UUID.randomUUID().toString().substring(0, 8);
        
    }
    public Ticket(String seatno, String Flightno, int passportno, String planedid, String ticketno) {
        //search constructor
        this.seatno = seatno;
        this.Flightno = Flightno;
        this.passportno = passportno;
        this.planedid = planedid;
        this.ticketno = ticketno;
        
    }
    
    public String getSeatno() {
        return seatno;
    }
    public String getFlightno() {
        return Flightno;
    }
    public int getPassportno() {
        return passportno;
    }
    public String getPlanedid() {
        return planedid;
    }
    public String getTicketno() {
        return ticketno;
    }
    public void setSeatno(String seatno) {
        this.seatno = seatno;
    }
    public void setFlightno(String Flightno) {
        this.Flightno = Flightno;
    }
    public void setPassportno(int passportno) {
        this.passportno = passportno;
    }
    public void setPlanedid(String planedid) {
        this.planedid = planedid;
    }
    public void setTicketno(String ticketno) {
        this.ticketno = ticketno;
    }

    @Override
    public String toString() {
        return "Ticket{" + "seatno=" + seatno + ", Flightno=" + Flightno + ", passportno=" + passportno + ", planedid=" + planedid + ", ticketno=" + ticketno  +"\n FlightDuration="+m.searchByFlightNumber(Flightno).calculateDuration()+", DepartureAirport="+m.searchByFlightNumber(Flightno).getDepartureAirport()+", DestinationAirport="+m.searchByFlightNumber(Flightno).getDestinationAirport()+", DepartureAirport="+m.searchByFlightNumber(Flightno).getDepartureTime()+", Price="+m.pricesetter(Flightno, seatno) +'}';
    }
}