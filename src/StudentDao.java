
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    public static void createStudent(Student st)
    {
       try {

         Connection conn = createDB.connectDb();
        String query = Query.insert;
        PreparedStatement pre = conn.prepareStatement(query);
        pre.setInt(1, st.getId()); 
        pre.setString(2, st.getName());
        pre.setString(3, st.getEmail());

        pre.executeUpdate();
        System.out.println("\nNew Student Created...\n");
        pre.close();
        
       } catch (Exception e) {
        System.out.println("ERROR IN CREATING ");
        e.printStackTrace();
       }

    }
    
    public static void readAllData(){
      try {
        Connection conn = createDB.connectDb();
        Statement stm = conn.createStatement();
        String query = Query.select;
        ResultSet data = stm.executeQuery(query);

        
        Student st = new Student();
        st.headerMain();
        while(data.next())
        {
          System.out.printf("%-10d%-20s%-20s%n", data.getInt(1), data.getString(2), data.getString(3));


        }
        stm.close();

        
      } catch (Exception e) {
        System.out.println("ERROR IN READING ");
        e.printStackTrace();
      }
    }
    

    public static void updateStudent(Student st){
      try {

        Connection conn = createDB.connectDb();
        String query = Query.update;

        PreparedStatement pre = conn.prepareStatement(query);
        pre.setString(1, st.getName());        
        pre.setString(2, st.getEmail());        
        pre.setInt(3, st.getId());     
        
        int rowUpdate = pre.executeUpdate();
        if(rowUpdate>0){
          System.out.println("\nStudent record updated successfully.");
        } else {
            System.out.println("\nNo records were updated.");
        }
        pre.close();
        
      } catch (Exception e) {
        System.out.println("ERROR IN UPDATE ");
        e.printStackTrace();
      }

    }

    public static void deleteSpecificStudent(int id)
    {
      try {

        Connection conn = createDB.connectDb();
        String query = Query.delete;

        PreparedStatement ptr = conn.prepareStatement(query);
        ptr.setInt(1, id);

       int del =  ptr.executeUpdate();
        if(del>0){
            System.out.println("Student with  ID "+id+" deleted");
        }else{
          System.out.println("Student with ID "+id+"Not Available");
        }
        ptr.close();        

      } catch (Exception e) {
        System.out.println("ERROR IN DELETING");
        e.printStackTrace();
      }
    }

}
