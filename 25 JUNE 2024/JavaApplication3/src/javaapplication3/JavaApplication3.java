package JavaApplication3;

import java.sql.*;

public class JavaApplication3 {
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // Call createUser method to create a new intern data
        //createUser(101, "Ahalya R S", 195);
//        readUser();
//        updateUser(101,198);
        readUser();
        deleteUser(101);
        readUser();
    }
    

    // Define createUser method outside main method
    public static void createUser(int id, String name, int mark) {
        String query = "INSERT INTO details(id, name, mark) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, mark);

            int rowsInserted = ps.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    //read user
    public static void readUser(){
        String query = "select * from details";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query)){
            System.out.println("Intern Details :");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String mark = rs.getString("mark");
                System.out.println("ID :"+ id + " Name :"+name+" Mark: "+mark);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void updateUser(int id, int newmark){
        String query = "update details set mark=? where id=? ";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setInt(1, newmark);
            ps.setInt(2, id);
            int rowsupdated = ps.executeUpdate();
            System.out.println("Rows updated "+ rowsupdated);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    
}
    public static void deleteUser(int id){
        String query = "delete from details where id=? ";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setInt(1, id);
          
            int rowsDeleted = ps.executeUpdate();
            System.out.println("Rows updated "+ rowsDeleted);
        }
        catch(SQLException e){
            System.out.println(e);
        }
}
}