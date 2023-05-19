package lab.Buoi_6.bai4;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        _1_JDBCRowSet pgm = new _1_JDBCRowSet();
        JdbcRowSet jrs = pgm.getJDBCRowSet();
        jrs.addRowSetListener(new MyListener1());
        pgm.loadAllRows(jrs);
        pgm.printAllRows(jrs);
        pgm.insertRow(jrs);
        pgm.updateRow(jrs);
        pgm.deleteRow(jrs);
        jrs.close();
        System.out.println("- Close.");
    }
}
