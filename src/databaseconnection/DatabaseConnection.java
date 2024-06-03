/*
 * @authour Sean 
 * This Form takes in customer details and saves them in the database
 * Date-13 September 2023
 *
 *
 */

package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Customers;encrypt=true;trustServerCertificate=true", "INSERT YOUR USER NAME", "INSERT YOUR PASSWORD");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

    public static void executeQuery(String query) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
