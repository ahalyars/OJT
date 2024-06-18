import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class simpleJavaApp {
    public static void main(String[] args)
    {
        String url="jdbc:mysql://localhost:3306/copa";
        String user="root";
        String password="";
        
        try(Connection conn=DriverManager.getConnection(url,user,password);
                Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery("Select * from staff"))
        {
            while(rs.next())
            {
                int id=rs.getInt("staff_id");
                String  name=rs.getString("first_name");
                System.out.println("ID"+id+" , Name"+name);
            }
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }
    }
    
}
