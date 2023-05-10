package lab.Buoi_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public Connection connectDatabase() {
        String url = "jdbc:mysql://localhost:3306/lu_javacore";
        Connection connection = null;

        // nap driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
        }

        // ket noi
        try {
            connection = DriverManager.getConnection(url, "root", "12345678");
        } catch (SQLException e) {
            System.err.println("SQLException - connection: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(new DB().connectDatabase() != null);
    }
}
