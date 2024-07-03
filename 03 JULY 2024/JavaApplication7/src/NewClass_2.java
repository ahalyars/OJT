import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewClass_2 {

    private static final String URL = "jdbc:mysql://localhost:3306/app7";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        String tableName = "Customers";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Insert records into the Customers table
            insertRecord(connection, tableName, 1,"Ahalya", "Attingal");
            insertRecord(connection, tableName,2, "Aparna", "Vellanad");
            insertRecord(connection, tableName, 3,"Arun", "Varkala");

            // Retrieve and print all records from the Customers table
            readRecords(connection, tableName);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Insert a new record into the Customers table
    private static void insertRecord(Connection connection, String tableName,int id, String name, String place) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (id,name, place) VALUES (?,?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
             preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, place);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 1) {
                System.out.println("Record inserted successfully: " + name + ", " + place);
            } else {
                System.out.println("Failed to insert record: " + name + ", " + place);
            }
        }
    }

    // Retrieve and print all records from the Customers table
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String place = resultSet.getString("place");
                System.out.println("ID: " + id + ", Name: " + name + ", City: " + place);
            }
        }
    }
}
