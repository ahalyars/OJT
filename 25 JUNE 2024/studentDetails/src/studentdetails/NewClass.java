package StudentDetails;

import java.sql.*;

public class NewClass {
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        createTable();
        insertEmployee(1, "John", "Doe", "john.doe@example.com", "2023-06-01");
    }

    public static void createTable() {
        String query = "CREATE TABLE employes (" +
                       "EmployeeID INT PRIMARY KEY, " +
                       "FirstName VARCHAR(50), " +
                       "LastName VARCHAR(50), " +
                       "Email VARCHAR(100), " +
                       "HireDate DATE)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Insert a new employee
    public static void insertEmployee(int employeeID, String FirstName, String LastName, String Email, String HireDate) {
        String query = "INSERT INTO Employees (EmployeeID, FirstName, LastName, Email, HireDate) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, employeeID);
            ps.setString(2, FirstName);
            ps.setString(3, LastName);
            ps.setString(4, Email);
            ps.setDate(5, Date.valueOf(HireDate));

            int rowsInserted = ps.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
