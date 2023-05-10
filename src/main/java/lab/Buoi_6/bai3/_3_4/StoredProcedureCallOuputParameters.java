package lab.Buoi_6.bai3._3_4;

import lab.Buoi_6.DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedureCallOuputParameters {
    public static void main(String[] args) {

        try (
                Connection conn = new DB().connectDatabase()
        ) {
            CallableStatement statement
                    = conn.prepareCall("{call summary_report (?,?,?,?)}");
            statement.registerOutParameter(2, Types.INTEGER);
            statement.registerOutParameter(3, Types.DOUBLE);
            statement.registerOutParameter(4, Types.DOUBLE);

            statement.setString(1, "Java");
            statement.execute();
            Integer totalBook = statement.getInt(2);
            Double totalValue = statement.getDouble(3);
            Double highPrice = statement.getDouble("highPrice");

            System.out.println("Total books: " + totalBook);
            System.out.println("Total value: " + totalValue);
            System.out.println("High price: " + highPrice);
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}