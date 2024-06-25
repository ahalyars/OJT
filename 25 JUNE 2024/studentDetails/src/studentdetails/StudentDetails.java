package StudentDetails;
import java.sql.*;
public class StudentDetails
{
        private static final String URL = "jdbc:mysql://localhost:3306/nstiw";
        private static final String USER = "root";
        private static final String PASSWORD = "";
        
        
     public static void main(String[] args)
    {
      createUser(1,"Ahalya",24,"Attingal");
      createUser(2,"Lisy",22,"thnkal");
      createUser(3,"Remya",24,"chrkzh");
      createUser(4,"Kajal",24,"vejmood");
      createUser(5,"Aparna",21,"pothangod");
      createUser(6,"Anulekshmi",23,"Alamgod");
      
    }
    
    public static void createUser(int id,String name,int age,String place)
    {
        String query="INSERT INTO STUDENT(id,name,age,place)VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) 
        {
            ps.setInt(1, id);
            ps.setString(2,name);
            ps.setInt(3, age);
            ps.setString(4,place);
            
            int  rowInserted=ps.executeUpdate();
            System.out.println("Row Inserted = "+rowInserted);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public static void ceateUpdate(int id,String newplace)
    {
        String query="UPDATE student SET place=? where id=?";
         try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) 
        {
            ps.setInt(1, newplace);
            ps.setString(2,id);
            
            int  rowInserted=ps.executeUpdate();
            System.out.println("Row Inserted = "+rowInserted);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
   
}