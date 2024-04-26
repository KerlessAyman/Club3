 
package clup_owners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class seccurity {
     private final String user="root";
    private final String password="root";
    private final String add="jdbc:mysql://localhost/club";
    public Connection connect() throws SQLException {
       Connection r=DriverManager.getConnection(add,user, password);
       return r;
    }
    
}
