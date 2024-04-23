import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Step 1: Load and register MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Establish connection
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "Rhs@1314232428";
            connection = DriverManager.getConnection(url, username, password);

            // Step 3: Create database
            statement = connection.createStatement();
            String dbName = "MemoryGame";
            String createDbQuery = "CREATE DATABASE " + dbName;
            statement.executeUpdate(createDbQuery);
            System.out.println("Database created successfully.");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close resources in reverse order
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
