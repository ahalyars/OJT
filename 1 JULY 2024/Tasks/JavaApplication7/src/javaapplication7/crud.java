package javaapplication7;

import java.sql.*;

public class crud {
    private static final String URL = "jdbc:mysql://localhost:3306/app7";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            // Create record
            createRecord(connection, 1, "Ahalya", "ahalya@gmail.com");
            // Read records
            readRecords(connection);
            // Update record
            updateRecord(connection, 1, "Ahalya R S", "ahalya@gmail.com");
            // Delete record
            deleteRecord(connection, 1);
            // Close connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create record
    public static void createRecord(Connection connection, int id, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO users(id, name, email) VALUES(?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(insertSQL)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.executeUpdate();
            System.out.println("Created Successfully");
        }
    }

    // Read records
    private static void readRecords(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM users";
        try (PreparedStatement ps = connection.prepareStatement(selectSQL);
             ResultSet resultSet = ps.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("id: " + id + " Name: " + name + " email: " + email);
            }
        }
    }

    // Update record
    private static void updateRecord(Connection connection, int id, String name, String email) throws SQLException {
        String updateSQL = "UPDATE users SET name=?, email=? WHERE id=?";
        try (PreparedStatement ps = connection.prepareStatement(updateSQL)) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);
            ps.executeUpdate();
            System.out.println("Record Updated");
        }
    }

    // Delete record
    private static void deleteRecord(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM users WHERE id=?";
        try (PreparedStatement ps = connection.prepareStatement(deleteSQL)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Record Deleted");
        }
    }
}
