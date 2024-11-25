package flightbooking;

import javax.swing.JOptionPane;

public class LogIn {
    
             
    MyProvider m= new MyProvider();
  public boolean login(String username,String password){
      try{
      if (m.searchByUsernameAndPassword(username, password)!=null) {
          JOptionPane.showMessageDialog(null , "Welcome back!!!");
         new Home().setVisible(true);
         
          return true;
      }else{
          throw new InvalidException("Invalid Username or password");
           
      }     
      }catch(InvalidException x){
      JOptionPane.showMessageDialog(null, x.getMessage());
            return false;
      }
      
      catch(Exception x){
      JOptionPane.showMessageDialog(null, x.getMessage());
            return false;
      }
}
    
}
