import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewClass {

    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        String databaseName = "base";
        String tableName = "users";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            createDatabase(connection, databaseName);
            connection.setCatalog(databaseName);
            createTable(connection, tableName);

            createRecord(connection, tableName, 2,"John Doe", "john.doe@example.com");
            createRecord(connection, tableName,3, "Jane Smith", "jane.smith@example.com");
            createRecord(connection, tableName,4, "Bob Johnson", "bob.johnson@example.com");

            readRecords(connection, tableName);

            updateRecord(connection, tableName, 1, "Johnathan Doe", "johnathan.doe@example.com");

            deleteRecord(connection, tableName, 2);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new database
    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
        try (Statement statement = connection.createStatement()) {
            if (statement.executeUpdate(createDatabaseSQL) == 1) {
                System.out.println("Database created successfully");
            } else {
                System.out.println("Failed to create database");
            }
        }
    }

    // Create a new table
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(100) NOT NULL)";
        try (Statement statement = connection.createStatement()) {
            if (statement.executeUpdate(createTableSQL) == 0) {
                System.out.println("Table created successfully");
            } else {
                System.out.println("Failed to create table");
            }
        }
    }

    // Create a new record
    private static void createRecord(Connection connection, String tableName, int par, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (name, email) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            if (preparedStatement.executeUpdate() == 1) {
                System.out.println("Record created successfully");
            } else {
                System.out.println("Failed to create record");
            }
        }
    }

    // Read records from the database
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        }
    }

    // Update an existing record
    private static void updateRecord(Connection connection, String tableName, int id, String name, String email) throws SQLException {
        String updateSQL = "UPDATE " + tableName + " SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, id);
            if (preparedStatement.executeUpdate() == 1) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("Failed to update record");
            }
        }
    }

    // Delete a record from the database
    private static void deleteRecord(Connection connection, String tableName, int id) throws SQLException {
        String deleteSQL = "DELETE FROM " + tableName + " WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, id);
            if (preparedStatement.executeUpdate() == 1) {
                System.out.println("Record deleted successfully");
            } else {
                System.out.println("Failed to delete record");
            }
        }
    }
}
