import java.sql.*;

public class JavaApplication7 {
    private static String URL = "jdbc:mysql://localhost:3306/app7";
    private static String USER = "root";
    private static String PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database");
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
