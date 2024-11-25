package flightbooking;
import java.util.UUID;

public class Seat {
    MyProvider m= new MyProvider();
    private String seatId;
    private boolean isOccupied;
    private boolean isFirstClass;
    private String seatbookingNo;
    private String Planeid;
    public Seat(String Planeid) {
        this.Planeid=Planeid;
        this.seatId = UUID.randomUUID().toString().substring(0, 8) ;
        this.isOccupied = false;
        this.isFirstClass = false;
        this.seatbookingNo=null;
    }
    public Seat(String seatId, boolean isOccupied, boolean isFirstClass, String seatbookingNo, String Planeid) {
        this.seatId = seatId;
        this.isOccupied = isOccupied;
        this.isFirstClass = isFirstClass;
        this.seatbookingNo = seatbookingNo;
        this.Planeid = Planeid;
    }
    
    public String getSeatNumber() {
        return seatId;
    }
    public String getPlaneid() {
        return Planeid;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public void occupySeat() {
        this.isOccupied = true;
    }
    public void vacateSeat() {
        this.isOccupied = false;
    }
    public boolean isFirstClass() {
        return isFirstClass;
    }
    public void setFirstClass() {
        this.isFirstClass = true;
    }
    public void cancelFirstClass() {
        this.isFirstClass = false;
    }
    
     /*public void bookSeat(int seatIndex,boolean firstclass) {
        this.seat=flight.getPlane().getAvailableSeats().get(seatIndex);
        this.seat.occupySeat();
        if (firstclass==true) {
           this.seat.setFirstClass();
        }
        this.seatbookingNo=UUID.randomUUID().toString().substring(0, 8);
        this.seat.setBookingNo(this.seatbookingNo);
        System.out.println("Seat booked: " + seat.getSeatNumber() + "\n" + "Seat booking number"+this.seatbookingNo);
    }*/
    public void setBookingNo(String bookingNo) {
        this.seatbookingNo = bookingNo;
    }
    public String getBookingNo() {
        return seatbookingNo;
}
 
}