import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.beans.*;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMs", "root", "123456789");
            System.out.println("Databases Connected Successfully");
             connection.setAutoCommit(true);
            statement = connection.createStatement();
            
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
 

    
}
