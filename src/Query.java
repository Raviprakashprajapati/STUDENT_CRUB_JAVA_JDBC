
public class Query {
   public static String insert = "INSERT INTO student (id,name,emailId) VALUES (?,?,?)";

   public static String update = "UPDATE student SET name = ?,emailId = ? WHERE id=?";
    
   public static String delete = "DELETE FROM student WHERE id=?";

   public static String select = "SELECT * FROM student ";

}
