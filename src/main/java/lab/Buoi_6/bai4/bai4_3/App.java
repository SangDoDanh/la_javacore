package lab.Buoi_6.bai4.bai4_3;

import lab.Buoi_6.DB;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws SQLException {
        DB db = new DB();
        Connection connection = db.connectDatabase();
        String sqlAu = "SELECT * FROM authors;";
        String sqlBook = "SELECT * FROM books;";

        Statement statementAU = connection.createStatement();
        Statement statementBk = connection.createStatement();
        ResultSet resultSetAu = statementAU.executeQuery(sqlAu);
        ResultSet resultSetBK = statementBk.executeQuery(sqlBook);

        // tao cachedRowset
        RowSetFactory  rowSetFactory = RowSetProvider.newFactory();
        CachedRowSet cachedAu = rowSetFactory.createCachedRowSet();
        CachedRowSet cachedBk = rowSetFactory.createCachedRowSet();

        // tao gia tri cho cachedRowset
        cachedAu.setTableName("authors");
        cachedBk.setTableName("books");
        cachedAu.populate(resultSetAu);
        cachedBk.populate(resultSetBK);

        // tao joinSet

        JoinRowSet joinRowSet = rowSetFactory.createJoinRowSet();
        joinRowSet.addRowSet(cachedBk, "author_id");
        joinRowSet.addRowSet(cachedAu, "author_id");

        while (joinRowSet.next()) {
            String desc = joinRowSet.getString("description");
            String name = joinRowSet.getString("name");
            String title = joinRowSet.getString("title");
            System.out.println(name + " : " + title + "   :  " + desc);
        }


        joinRowSet.close();
        cachedAu.close();
        cachedBk.close();
        connection.close();

    }
}
