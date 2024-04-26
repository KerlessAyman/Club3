 
package clup_owners;

 
import java.util.ArrayList;
 
public abstract class basic {
    private String user_name,password;
    int s;
    public ArrayList<basic> list =new ArrayList<>();
 

    public basic() {
    }
    
     public basic(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      public abstract void insert_user(String user,String pass);
   public abstract  ArrayList<basic> getuser();
     
    
    
   public abstract int check_user(String user,String pass);

    @Override
    public abstract String toString();
    

}
