

import java.sql.Connection;
import java.sql.DriverManager;
public class createDB {
  
     static Connection conn = null;
     public static Connection connectDb(){
               try {
                String url = "jdbc:mysql://localhost:3306/codejava";
                String userName = "root";
                String password = "root123";
                Class.forName("com.mysql.cj.jdbc.Driver");

                 conn = DriverManager.getConnection(url,userName,password);
    			
                
        }
            catch(Exception e) {
                System.out.println("ERROR IN DB CONNECT ");
                e.printStackTrace();
            }
            return conn;

     }
            
            
     
    
    
}
