package flightbooking;
import java.util.Objects;
public class Passenger {
    private String name;
    private int age;
    private int passportNumber;

    public Passenger(String name, int age, int passportNumber) {
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }
    public Passenger(){
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("Security alert");
            return true;
        }
        if (obj == null) {
            
            return false;
        }
        if (getClass() != obj.getClass()) {
            
            return false;
        }
        final Passenger other = (Passenger) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.passportNumber, other.passportNumber);
}
}