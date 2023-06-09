package lab.Buoi_6.bai3._3_2;

import lab.Buoi_6.DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedureCallSelect {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");// nap driver
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
        }
    }

    ;

    public static void main(String[] args) throws SQLException {

        Connection conn = new DB().connectDatabase();
        CallableStatement statement = conn.prepareCall("{call get_books(?)}");
        statement.setInt(1, 0);
        boolean hadResults = statement.execute();
        // print headings
        System.out.println("| Title | Description | Rating |");
        System.out.println("================================");
        while (hadResults) {
            ResultSet resultSet = statement.getResultSet();
            // process result set
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                int rating = resultSet.getInt("rating");
                System.out.println(
                        "| " + title + " | " + description + " | " + rating + " |");
            }
            hadResults = statement.getMoreResults();
        }
        statement.close();
    }
}