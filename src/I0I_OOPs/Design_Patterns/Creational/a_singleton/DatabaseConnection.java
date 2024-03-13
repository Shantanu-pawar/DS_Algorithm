package I0I_OOPs.Design_Patterns.Creational.a_singleton;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Static field to hold the single instance of the class
    private static DatabaseConnection instance;

    // Connection object
    private Connection connection;

    // Private constructor to prevent instantiation from outside
    private DatabaseConnection() {
        // connection
        try {
            connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Static method to provide access to the singleton instance
    public static DatabaseConnection getInstance() {
        // Lazy initialization: create instance if it doesn't exist
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Method to get the database connection
    public Connection getConnection() {
        return connection;
    }


// class Main {
    public static void main(String[] args) {
        // Get the singleton database connection instance
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        // Use the connection
        Connection connection = dbConnection.getConnection();
    }
}
