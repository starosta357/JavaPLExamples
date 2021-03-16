package _13SOLID._1single_reponsibility_principle.example_from_slide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static final DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
    private Connection connection;

    private DatabaseConnectionManager() {

    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("DB URL here");
        System.out.println("connection to DB established");
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("disconnect from DB ");
    }

    public Connection getConnection() {
        return connection;
    }

}
