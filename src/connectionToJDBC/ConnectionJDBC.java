package connectionToJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            System.out.println("connection Sucessfull proceed");
        } catch (SQLException e) {
            System.out.println("Connection faliure");
            e.printStackTrace();
        }
    }

    //Statement statement=connection.createStatement();
}
