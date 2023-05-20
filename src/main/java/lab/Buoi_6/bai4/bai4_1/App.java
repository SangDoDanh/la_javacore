package lab.Buoi_6.bai4.bai4_1;

import lab.Buoi_6.DB;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        DB db = new DB();
        Connection connection = db.connectDatabase();
        RowSetFactory rowSetFactory = RowSetProvider.newFactory();

        JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();
        jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/lu_javacore");
        jdbcRowSet.setPassword("12345678");
        jdbcRowSet.setUsername("root");
        getAll(jdbcRowSet);
        printAll(jdbcRowSet);
//        insert(jdbcRowSet);
//        updateRow(jdbcRowSet);
        deleteRow(jdbcRowSet);

    }

    static void getAll(JdbcRowSet jdbcRowSet) throws SQLException {
        String sql = "SELECT * FROM authors;";
        jdbcRowSet.setCommand(sql);
        jdbcRowSet.execute();
        jdbcRowSet.last();

        System.out.println("total rows:  " + jdbcRowSet.getRow());
    }

    static void printAll(JdbcRowSet jdbcRowSet) throws SQLException {
        System.out.println("print all rows with rowset");
        jdbcRowSet.beforeFirst();
        while (jdbcRowSet.next()) {
            int rowNo = jdbcRowSet.getRow();
            String name = jdbcRowSet.getString("name");
            String email = jdbcRowSet.getString("email");
            System.out.println(rowNo + ": " + name + ", " + email);

        }
    }

    static void insert(JdbcRowSet jdbcRowSet) throws SQLException {
        System.out.println("- Insert row: ");
        jdbcRowSet.moveToInsertRow();
        jdbcRowSet.updateString("name", "Quang");
        jdbcRowSet.updateString("email", "Quang@gmail.com");
        jdbcRowSet.updateInt("author_id", 3);
        jdbcRowSet.insertRow();
        getAll(jdbcRowSet);
    }

    static void updateRow(JdbcRowSet jdbcRowSet) throws SQLException {
        System.out.println("- Update row " + 3);
        jdbcRowSet.absolute(3);
        jdbcRowSet.updateString("name", "Sang");
        jdbcRowSet.updateRow();
        printAll(jdbcRowSet);
    }

    static void deleteRow(JdbcRowSet jdbcRowSet)  throws SQLException {

        jdbcRowSet.absolute(3);
        jdbcRowSet.deleteRow();

        printAll(jdbcRowSet);
    }
}