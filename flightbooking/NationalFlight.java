package flightbooking;
import java.time.LocalDateTime;
public class NationalFlight extends Flight {
    private double domesticAirportTax;
    public NationalFlight(String flightNumber,String departureAirport, String destinationAirport, String departureTime, String arrivalTime, String planeid, double domesticAirportTax,int numberOfBags,double totalWeight) {
        super(flightNumber,departureAirport, destinationAirport, departureTime, arrivalTime, planeid,numberOfBags,totalWeight);
        this.domesticAirportTax = domesticAirportTax;
    }
    @Override
    public double calculatenumBaggageFee() {
        if (this.getNumberOfBags()>1) {
                double feePerBag = 30;
        return this.getNumberOfBags() * feePerBag;
        }else{
          return 0;  
        }
    }

    @Override
    public double calculateweightBaggageFee() {
        if (this.getTotalWeight()>60) {
            double feePerKg = 5;
        return this.getTotalWeight() * feePerKg;
        }else{
            return 0;
        }
    }
    public double totalBaggageFee() {
        return calculatenumBaggageFee() + calculateweightBaggageFee();
    }
    public double getDomesticAirportTax() {
        return domesticAirportTax;
    }
    public void setDomesticAirportTax(double domesticAirportTax) {
        this.domesticAirportTax = domesticAirportTax;
}
}