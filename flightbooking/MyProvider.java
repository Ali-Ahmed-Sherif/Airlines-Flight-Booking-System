package flightbooking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static org.sqlite.SQLiteErrorCode.SQLITE_CONSTRAINT_PRIMARYKEY;
import static org.sqlite.SQLiteErrorCode.SQLITE_CONSTRAINT_UNIQUE;
public class MyProvider {
   static String url = "jdbc:sqlite:C:\\Users\\Ali Ahmed\\OneDrive - Alexandria National University\\Desktop\\semester 2 3.77\\oop project\\flightbookingss.db";
Connection conn=null; 
    public MyProvider() {
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
        }catch(Exception ex){
            System.err.println(ex);
        }
        
    }
    public boolean addNewPassenger(Passenger s){
        String sql="INSERT INTO Passenger (name,age,passportNumber) VALUES(?,?,?)";
        try{
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,s.getName());
            pstmt.setInt(2,s.getAge());
            pstmt.setInt(3, s.getPassportNumber());
            pstmt.executeUpdate();
            return true;
        }catch (SQLException e) {
        if (e.getErrorCode() == 19) {
          System.err.println("Duplicate primary key or unique constraint violation: " + e.getMessage());
         } else {
            System.err.println(e.getMessage());
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    return false;
}
    public ArrayList<Passenger> getAllPassengers(){
        ArrayList<Passenger> list= new ArrayList<Passenger>();
        String sql="SELECT * FROM Passenger";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                String n=rs.getString(1);
                int a=rs.getInt(2);
                int p=rs.getInt(3);
                Passenger s=new Passenger(n,a,p);
                list.add(s);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        } 
        return list;
    }
    public Passenger searchByPassport(int PassportNumber){
        String sql="SELECT * FROM Passenger WHERE PassportNumber="+PassportNumber;
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                String n=rs.getString(1);
                int a=rs.getInt(2);
                int p=rs.getInt(3);
                Passenger s=new Passenger(n,a,p);
                return s;
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return null;
    }
     public boolean addNewPlane(Plane s){
        String sql="INSERT INTO Plane (numOfSeats,airline,fuelCapacity,manufacturingYear,planeId) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,s.getNumOfSeats());
            pstmt.setString(2,s.getAirline());
            pstmt.setDouble(3, s.getFuelCapacity());
            pstmt.setInt(4,s.getManufacturingYear());
            pstmt.setString(5,s.getPlaneId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
        if (e.getErrorCode() == 19) {
            System.err.println("Duplicate primary key: " + e.getMessage());
            return false;
        } else {
            System.err.println(e.getMessage());
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    return false;
}
     public ArrayList<Plane> getAllPlanes(){
        ArrayList<Plane> list= new ArrayList<Plane>();
        String sql="SELECT * FROM Plane";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                int n=rs.getInt(1);
                String a=rs.getString(2);
                double p=rs.getDouble(3);
                int m=rs.getInt(4);
                String l=rs.getString(5);            
                Plane s=new Plane(n,a,p,m,l);
                list.add(s);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return list;
    }
public Plane SearchbyPlaneId(String PlaneId){
    String sql = "SELECT * FROM Plane WHERE PlaneId='" + PlaneId + "'";
    try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            int n = rs.getInt(1);
            String a = rs.getString(2);
            double p = rs.getDouble(3);
            int m = rs.getInt(4);
            String l = rs.getString(5);            
            Plane s = new Plane(n, a, p, m, l);
            return s;
        }
    } catch(Exception e) {
        System.err.println(e.getMessage());
    } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    return null;
}

    public boolean addNewInternationalflight(InternationalFlight s){
        String sql="INSERT INTO InternationalFlight (flightNumber,departureAirport,destinationAirport,departureTime,arrivalTime,planeid,numberOfBags,totalWeight) VALUES(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,s.getFlightNumber());
            pstmt.setString(2,s.getDepartureAirport());
            pstmt.setString(3, s.getDestinationAirport());
            pstmt.setString(4, s.getDepartureTime());
            pstmt.setString(5, s.getArrivalTime());
            pstmt.setString(6, s.getPlaneid());
            pstmt.setInt(7, s.getNumberOfBags());
            pstmt.setDouble(8, s.getTotalWeight());
            pstmt.executeUpdate();
            return true;
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
     public ArrayList<InternationalFlight> getAllInternationalFlight(){
        ArrayList<InternationalFlight> list= new ArrayList<InternationalFlight>();
        String sql="SELECT * FROM InternationalFlight";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString(1);
                String b=rs.getString(2);
                String c=rs.getString(3);
                String d=rs.getString(4);
                String e=rs.getString(5);
                String f=rs.getString(6);
                int g=rs.getInt(7);
                double p=rs.getDouble(8);          
                InternationalFlight s=new InternationalFlight(a,b,c,d,e,f,g,p);
                list.add(s);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return list;
    }
     public InternationalFlight SearchbyInternationalFlightNumber(String FlightNumber) {
    String sql = "SELECT * FROM InternationalFlight WHERE FlightNumber = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, FlightNumber);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String a = rs.getString(1);
            String b = rs.getString(2);
            String c = rs.getString(3);
            String d = rs.getString(4);
            String e = rs.getString(5);
            String f = rs.getString(6);
            int g = rs.getInt(7);
            double p = rs.getDouble(8);
            return new InternationalFlight(a, b, c, d, e, f, g, p);
        }
    } catch (SQLException e) {
        System.err.println("Error executing query: " + e.getMessage());
    }
    return null;
}
     public Flight searchByFlightNumber(String flightNumber) {
    String sqlNational = "SELECT * FROM NationalFlight WHERE FlightNumber = ?";
    try (PreparedStatement stmtNational = conn.prepareStatement(sqlNational)) {
        stmtNational.setString(1, flightNumber);
        ResultSet rsNational = stmtNational.executeQuery();
        if (rsNational.next()) {
            String a = rsNational.getString(1);
            String b = rsNational.getString(2);
            String c = rsNational.getString(3);
            String d = rsNational.getString(4);
            String e = rsNational.getString(5);
            String f = rsNational.getString(6);
            double p = rsNational.getDouble(7);
            int g = rsNational.getInt(8);
            double i = rsNational.getDouble(9);
            return new NationalFlight(a, b, c, d, e, f, p, g, i);
        }
    } catch (SQLException e) {
        System.err.println("Error executing query for NationalFlight: " + e.getMessage());
        return null;
    }

    String sqlInternational = "SELECT * FROM InternationalFlight WHERE FlightNumber = ?";
    try (PreparedStatement stmtInternational = conn.prepareStatement(sqlInternational)) {
        stmtInternational.setString(1, flightNumber);
        ResultSet rsInternational = stmtInternational.executeQuery();
        if (rsInternational.next()) {
            String a = rsInternational.getString(1);
            String b = rsInternational.getString(2);
            String c = rsInternational.getString(3);
            String d = rsInternational.getString(4);
            String e = rsInternational.getString(5);
            String f = rsInternational.getString(6);
            int g = rsInternational.getInt(7);
            double p = rsInternational.getDouble(8);
            return new InternationalFlight(a, b, c, d, e, f, g, p);
        }
    } catch (SQLException e) {
        System.err.println("Error executing query for InternationalFlight: " + e.getMessage());
    }

    return null;
}


     public boolean addNewUser(User s){
        String sql="INSERT INTO User (username, password) VALUES(?,?)";
        try{
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,s.getUsername());
            pstmt.setString(2,s.getPassword());
            pstmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
    public ArrayList<User> getAllusers(){
        ArrayList<User> list= new ArrayList<User>();
        String sql="SELECT * FROM User";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                String n=rs.getString(1);
                String a=rs.getString(2);         
                User s=new User(n,a);
                list.add(s);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return list;
    }
    public User searchByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM User WHERE username = ? AND password = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String dbUsername = rs.getString("username");
                String dbPassword = rs.getString("password");
                return new User(dbUsername, dbPassword);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return null; 
    }
    public boolean addNewNationalflight(NationalFlight s){
        String sql="INSERT INTO NationalFlight (flightNumber,departureAirport,destinationAirport,departureTime,arrivalTime,planeid,domesticAirportTax,numberOfBags,totalWeight) VALUES(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,s.getFlightNumber());
            pstmt.setString(2,s.getDepartureAirport());
            pstmt.setString(3, s.getDestinationAirport());
            pstmt.setString(4, s.getDepartureTime());
            pstmt.setString(5, s.getArrivalTime());
            pstmt.setString(6, s.getPlaneid());
            pstmt.setDouble(7, s.getDomesticAirportTax());
            pstmt.setInt(8, s.getNumberOfBags());
            pstmt.setDouble(9, s.getTotalWeight());
            pstmt.executeUpdate();
            return true;
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
     public ArrayList<NationalFlight> getAllNationalFlight(){
        ArrayList<NationalFlight> list= new ArrayList<NationalFlight>();
        String sql="SELECT * FROM NationalFlight";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString(1);
                String b=rs.getString(2);
                String c=rs.getString(3);
                String d=rs.getString(4);
                String e=rs.getString(5);
                String f=rs.getString(6);
                double p=rs.getDouble(7);  
                int g=rs.getInt(8);
                double i=rs.getDouble(9);
                NationalFlight s=new NationalFlight(a,b,c,d,e,f,p,g,i);
                list.add(s);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return list;
    }
public NationalFlight SearchbyNationalFlightNumber(String FlightNumber) {
    String sql = "SELECT * FROM NationalFlight WHERE FlightNumber='" + FlightNumber + "'";
    try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String a = rs.getString(1);
            String b = rs.getString(2);
            String c = rs.getString(3);
            String d = rs.getString(4);
            String e = rs.getString(5);
            String f = rs.getString(6);
            double p = rs.getDouble(7);
            int g = rs.getInt(8);
            double i = rs.getDouble(9);
            NationalFlight s = new NationalFlight(a, b, c, d, e, f, p, g, i);
            return s;
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    } /*finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }*/
    return null;
}
public boolean addNewSeat(Seat s){
        String sql="INSERT INTO Seat (seatNumber,isOccupied,isFirstClass,seatbookingNo,Planeid) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,s.getSeatNumber());
            pstmt.setBoolean(2,s.isOccupied());
            pstmt.setBoolean(3, s.isFirstClass());
            pstmt.setString(4,s.getBookingNo());
            pstmt.setString(5,s.getPlaneid());
            pstmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
   public Seat SearchbySeatNumber(String seatNumber){
        String sql="SELECT * FROM Seat WHERE seatNumber='" + seatNumber + "'";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                String a=rs.getString(1);
                Boolean b=rs.getBoolean(2);
                Boolean c=rs.getBoolean(3);
                String d=rs.getString(4);
                String m=rs.getString(5);
                Seat s=new Seat(a,b,c,d,m);
                return s;
            }          
        }catch(Exception e){
            System.err.println(e.getMessage());
        } /*finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }*/
        return null;
    }
        public boolean addNewTicket(Ticket s){
        String sql="INSERT INTO Ticket (seatno,passportno,planedid,ticketno,Flightno) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,s.getSeatno());
            pstmt.setInt(2,s.getPassportno());
            pstmt.setString(3, s.getPlanedid());
            pstmt.setString(4,s.getTicketno());
            pstmt.setString(5,s.getFlightno());
            pstmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
       /* public ArrayList<Ticket> getAllTickets(){
        ArrayList<Ticket> list= new ArrayList<Ticket>();
        String sql="SELECT * FROM Ticket";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString(1);
                int n=rs.getInt(2);
                String l=rs.getString(3);
                String m=rs.getString(4);
                double p=rs.getDouble(5);
                String b=rs.getString(6);
                Ticket s=new Ticket(a,b,n,l,m,p);
                list.add(s);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return list;
    }*/
        /*public Ticket SearchbyTicketNo(String Ticketno){
        String sql="SELECT * FROM Ticket WHERE ticketno='" + Ticketno + "'";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                String a=rs.getString(1);
                int n=rs.getInt(2);
                String l=rs.getString(3);
                String m=rs.getString(4);
                double p=rs.getDouble(5);
                String b=rs.getString(6);
                Ticket s=new Ticket(a,b,n,l,m,p);
                return s;
            }          
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return null;
    }*/
public void updateSeat(String seatNumber, boolean isFirstClass, String seatBookingNo) {
  try {
    String sql = "UPDATE Seat SET isFirstClass = ?, seatBookingNo = ?, isOccupied = 1 WHERE seatNumber = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setBoolean(1, isFirstClass);
    pstmt.setString(2, seatBookingNo);
    pstmt.setString(3, seatNumber);
    
    int rowsUpdated = pstmt.executeUpdate();

    if (rowsUpdated > 0) {
      System.out.println("Seat updated successfully.");
    } else {
      System.out.println("Seat not found with seat number: " + seatNumber);
    }
  } catch (Exception e) {
    System.err.println(e.getMessage());
  } /*finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }*/
}
public boolean updateUser(String username, String password, String newUsername, String newPassword) {
    String selectSql = "SELECT * FROM User WHERE username = ? AND password = ?";
    String updateSql = "UPDATE User SET username = ?, password = ? WHERE username = ?";

    try {
        PreparedStatement selectStmt = conn.prepareStatement(selectSql);
        selectStmt.setString(1, username);
        selectStmt.setString(2, password);
        ResultSet rs = selectStmt.executeQuery();

        if (rs.next()) {
            String dbUsername = rs.getString("username");
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, newUsername);
            updateStmt.setString(2, newPassword);
            updateStmt.setString(3, dbUsername);
            int rowsUpdated = updateStmt.executeUpdate();
            return rowsUpdated > 0;
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    return false;
}
public boolean deleteUser(String username, String password) {
    String selectSql = "SELECT * FROM User WHERE username = ? AND password = ?";
    String deleteSql = "DELETE FROM User WHERE username = ?";

    Connection conn = null;
    try {
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\Youssef\\Desktop\\oop\\flightbooking\\flightbookingss.db";
        conn = DriverManager.getConnection(url);
        PreparedStatement selectStmt = conn.prepareStatement(selectSql);
        selectStmt.setString(1, username);
        selectStmt.setString(2, password);
        ResultSet rs = selectStmt.executeQuery();
        if (rs.next()) {
            String dbUsername = rs.getString("username");
            PreparedStatement deleteStmt = conn.prepareStatement(deleteSql);
            deleteStmt.setString(1, dbUsername);
            int rowsDeleted = deleteStmt.executeUpdate();
            return rowsDeleted > 0;
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    return false;
}
   public void vacateSeat(String seatNumber) {
  try {
    String sql = "UPDATE Seat SET isFirstClass = 0, seatBookingNo = null, isOccupied = 0 WHERE seatNumber = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, seatNumber);
    int rowsUpdated = pstmt.executeUpdate();
    if (rowsUpdated > 0) {
      System.out.println("Seat occupancy updated successfully.");
    } else {
      System.out.println("Seat not found with seat number: " + seatNumber);
    }
  } catch (Exception e) {
    System.err.println(e.getMessage());
  } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
}
   public ArrayList<Seat> getAllSeats(){
        ArrayList<Seat> list= new ArrayList<Seat>();
        String sql="SELECT * FROM Seat";
        try{
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString(1);
                Boolean b=rs.getBoolean(2);
                Boolean c=rs.getBoolean(3);
                String d=rs.getString(4);        
                String m=rs.getString(5);
                Seat s=new Seat(m);
                list.add(s);
                if (list.isEmpty()) {
                    System.out.println("No seats");
                    
                }
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return list;
    }
      
   public double pricesetter(String Flightnumber, String Seatnumber) {
    MyProvider m = new MyProvider();
    Flight n = m.SearchbyNationalFlightNumber(Flightnumber);
    try{
    if (n == null) {
        n = m.SearchbyInternationalFlightNumber(Flightnumber);
        if (n == null) {
            System.err.println("Error: Flight not found");
            return -1;
        }
    }
    
    Seat s = m.SearchbySeatNumber(Seatnumber);
    
    if (s == null) {
        System.err.println("Error: Seat not found");
        return -1;
    }
    
    if (s.isFirstClass() && n instanceof NationalFlight) {
        NationalFlight z = (NationalFlight) n;
        return (10000 * z.getDomesticAirportTax()) + z.totalBaggageFee();
    } else if (!s.isFirstClass() && n instanceof NationalFlight) {
        NationalFlight z = (NationalFlight) n;
        return (3000 * z.getDomesticAirportTax()) + z.totalBaggageFee();
    } else if (s.isFirstClass() && n instanceof InternationalFlight) {
        InternationalFlight z = (InternationalFlight) n;
        return 10000 + z.totalBaggageFee();
    } else if (!s.isFirstClass() && n instanceof InternationalFlight) {
        InternationalFlight z = (InternationalFlight) n;
        return 3000 + z.totalBaggageFee();
    } else {
        System.err.println("Error: Invalid combination of flight and seat");
        return -1; 
    }
    }catch(Exception ex){
    }finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    return 0;
}
}