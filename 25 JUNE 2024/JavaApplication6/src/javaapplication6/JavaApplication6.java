package JavaApplication6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaApplication6 {

    private static final String URL = "jdbc:mysql://localhost:3306/employee";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
//        int EmployeeID = 3;
//        String FirstName = "appu";
//        String LastName = "A";
//        String Email = "appoose@gmail.com";
//        String HireDate = "2022-04-09";
        readUser();
        hiredUser();
         update(1, "ahalyars@gmail.com");
         readUser();
         updateHireDate("Doe", "2023-01-06");
         readUser();
         deleteEmployee(1);
         readUser();
         HiredBefore("2023-01-01");
          readUser();
         

//        createUser(EmployeeID, FirstName, LastName, Email, HireDate);
 
    }

    public static void createUser(int EmployeeID, String FirstName, String LastName,String Email, String HireDate) {
        String query = "INSERT INTO employee (EmployeeID, FirstName, LastName, Email, HireDate) VALUES (?, ?, ?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setInt(1, EmployeeID);
            ps.setString(2, FirstName);
            ps.setString(3, LastName);
            ps.setString(4, Email);
            ps.setString(5, HireDate);
            int rowsInserted = ps.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void readUser() {
        String query = "SELECT * FROM employee";
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                int EmployeeID = rs.getInt("EmployeeID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                String Email = rs.getString("Email");
                String HireDate = rs.getString("HireDate");
                System.out.println("EmployeeID: " + EmployeeID + ", FirstName: " + FirstName + ", LastName: " + LastName + ", Email: " + Email + ", HireDate: " + HireDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void hiredUser() {
        String query = "SELECT FirstName, LastName FROM employee WHERE YEAR(HireDate) = 2023";
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                System.out.println("FirstName: " + FirstName + ", LastName: " + LastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void update(int EmployeeID, String newEmail) {
        String query = "UPDATE Employee SET Email = ? WHERE EmployeeID = ?";
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setString(1, newEmail);
            ps.setInt(2, EmployeeID);
            int rowsUpdated = ps.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void updateHireDate(String LastName, String newHireDate) {
        String query = "UPDATE employee SET HireDate = ? WHERE LastName = ?";
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setDate(1, java.sql.Date.valueOf(newHireDate));
            ps.setString(2, LastName);
            int rowsUpdated = ps.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void deleteEmployee(int EmployeeID) {
        String query = "DELETE FROM employee WHERE EmployeeID = ?";
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setInt(1, EmployeeID);
            int rowsDeleted = ps.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public static void HiredBefore(String date) {
        String query = "DELETE FROM employee WHERE HireDate < ?";
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setDate(1, java.sql.Date.valueOf(date));
            int rowsDeleted = ps.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




 