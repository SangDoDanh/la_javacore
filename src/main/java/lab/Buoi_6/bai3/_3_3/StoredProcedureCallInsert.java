package lab.Buoi_6.bai3._3_3;

import lab.Buoi_6.DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class StoredProcedureCallInsert {

    public static void main(String[] args) throws SQLException {

        Connection conn = new DB().connectDatabase();
        CallableStatement statement
                = conn.prepareCall("{call create_author(?, ?)}");
        statement.setString(1, "Bill Gates");
        statement.setString(2, "bill@microsoft.com");
        statement.execute();
        statement.close();
        System.out.println("Stored procedure called successfully!");

    }
}