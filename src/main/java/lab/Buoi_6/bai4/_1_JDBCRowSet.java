package lab.Buoi_6.bai4;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class _1_JDBCRowSet {
    private int insertedRowNo;
    private final static String DB_URL = "jdbc:mysql://localhost:3306/lu_javacore";
    private final static String USR = "root";
    private final static String PWD = "12345678";
    private final static String BOOK_TABLE = "books_table";
    private final static String TITLE = "title";
    private final static String AUTHOR = "author";
    private final static String INSERT_ROW_TITLE = "Sach mới11";
    private final static String INSERT_ROW_AUTHOR = "Tác giả mới1";
    private final static String UPDATE_ROW_AUTHOR = "Sửa tên tác giả1";

    public JdbcRowSet getJDBCRowSet() throws SQLException {
        RowSetFactory rsFactory = RowSetProvider.newFactory();
        JdbcRowSet jRowSet = rsFactory.createJdbcRowSet();
        jRowSet.setUsername(USR);
        jRowSet.setPassword(PWD);
        jRowSet.setUrl(DB_URL);
        return jRowSet;
    }

    public void loadAllRows(JdbcRowSet jrs) throws SQLException {
        String sql = "SELECT * FROM " + BOOK_TABLE;
        jrs.setCommand(sql);
        jrs.execute();
        System.out.println("Total rows in table: " + getRowCount(jrs));

    }
    private int getRowCount(JdbcRowSet jrs) throws SQLException {
        jrs.last();
        return jrs.getRow();
    }

    public void printAllRows(JdbcRowSet jrs)  throws SQLException {
        System.out.println("- Print all rows:");
        jrs.beforeFirst();
        while (jrs.next()) {
            int rowNo = jrs.getRow();
            String s1 = jrs.getString(TITLE);
            String s2 = jrs.getString(AUTHOR);
            System.out.println(rowNo + ": " + s1 + ", " + s2);
        }
    }

    public void insertRow(JdbcRowSet jrs)  throws SQLException {
        System.out.println("- Insert row: ");
        jrs.moveToInsertRow();
        jrs.updateString(TITLE, INSERT_ROW_TITLE);
        jrs.updateString(AUTHOR, INSERT_ROW_AUTHOR);
        jrs.insertRow();

        insertedRowNo = jrs.getRow();
        String s1 = jrs.getString(TITLE);
        String s2 = jrs.getString(AUTHOR);
        System.out.println(insertedRowNo + ": " +
                jrs.getString(TITLE) + ", " + jrs.getString(AUTHOR));
        System.out.println("Total rows in table: " + getRowCount(jrs));
    }

    public void updateRow(JdbcRowSet jrs)   throws SQLException {
        System.out.println("- Update row " + insertedRowNo);
        jrs.absolute(insertedRowNo);
        String s1 = jrs.getString(TITLE);
        String s2 = jrs.getString(AUTHOR);
        System.out.println("Row (before update): " + s1 + ", " + s2);

        jrs.updateString("AUTHOR", UPDATE_ROW_AUTHOR);
        jrs.updateRow();

        s1 = jrs.getString(TITLE);
        s2 = jrs.getString(AUTHOR);
        System.out.println("Row (after update): " +  s1 + ", " + s2);
    }
    public void deleteRow(JdbcRowSet jrs)  throws SQLException {

        jrs.absolute(insertedRowNo);
        String s1 = jrs.getString(TITLE);
        String s2 = jrs.getString(AUTHOR);
        System.out.println("- Delete row " + insertedRowNo + ": " + s1 + ", " + s2);

        jrs.deleteRow();

        System.out.println("Total rows in table: " + getRowCount(jrs));
    }
}
