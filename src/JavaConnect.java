
import java.sql.*;
public class JavaConnect {
    Connection conn;
    public static Connection connect(){
        try{
         String username = "root";
         String password = "root";
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/LibraryDB",username,password);
         System.out.println("Connected");
         return conn;
        }catch(Exception e){
        System.out.println("Not Connected");
             }
        return null;
        
    }
    
    
    
}
