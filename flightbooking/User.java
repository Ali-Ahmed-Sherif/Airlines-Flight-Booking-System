
package flightbooking;
import javax.swing.JOptionPane;
public class User {
    private String username;
    private String password;
MyProvider m = new MyProvider();
public boolean SingUp(String un, String ps ){
 try {
      if(un == null || un.trim().isEmpty() || ps == null || ps.trim().isEmpty()){
      throw new IllegalArgumentException("Username and password cannot be empty");
      }
          
      User u = new User(un,ps); 
      m.addNewUser(u);
      return true;
      
      }catch(IllegalArgumentException x){
           
           JOptionPane.showMessageDialog(null, x.getMessage());
           return false;
      } 
      catch(Exception x){
          JOptionPane.showMessageDialog(null, x.getMessage());
          return false;
      }
     
}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
