package flightbooking;
import java.time.LocalDateTime;

public class InternationalFlight extends Flight {
public InternationalFlight(String flightNumber,String departureAirport, String destinationAirport, String departureTime, String arrivalTime, String planeid, int numberOfBags,double totalWeight) {
    super(flightNumber,departureAirport, destinationAirport, departureTime, arrivalTime, planeid,numberOfBags,totalWeight);

}
@Override
    public double calculatenumBaggageFee() {
        if (this.getNumberOfBags()>2) {
                double feePerBag = 50;
        return this.getNumberOfBags() * feePerBag;
        }else{
          return 0;  
        }
    }
    @Override
public double calculateweightBaggageFee() {
        if (this.getTotalWeight()>40) {
            double feePerKg = 10;
        return this.getTotalWeight() * feePerKg;
        }else{
            return 0;
        }
    }
    @Override
    public double totalBaggageFee() {
        return calculatenumBaggageFee() + calculateweightBaggageFee();
}
}