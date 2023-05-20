package lab.Buoi_6.bai4.bai4_2;

import lab.Buoi_6.DB;

import javax.sql.rowset.CachedRowSet;
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
        String sql = "SELECT * FROM authors;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        RowSetFactory  rowSetFactory = RowSetProvider.newFactory();
        CachedRowSet cachedRowSet = rowSetFactory.createCachedRowSet();
        connection.setAutoCommit(false);
        cachedRowSet.setTableName("authors");
        cachedRowSet.populate(resultSet);

        readAll(cachedRowSet);
//        insert(cachedRowSet);
//        update(cachedRowSet);
        delete(cachedRowSet);
        cachedRowSet.acceptChanges(connection);
        cachedRowSet.close();

    }

    static void readAll(CachedRowSet cachedRowSet) throws SQLException{
        while (cachedRowSet.next()) {
            String name = cachedRowSet.getString("name");
            String email = cachedRowSet.getString("email");
            System.out.println(name + " : " + email);
        }
    }
    static void insert(CachedRowSet cachedRowSet) throws SQLException {
        System.out.println("insert row ...");
        cachedRowSet.moveToInsertRow();
        cachedRowSet.updateInt("author_id", 5);
        cachedRowSet.updateString("name", "Thao");
        cachedRowSet.updateString("email", "Thao@gmail.com");
        cachedRowSet.insertRow();
        cachedRowSet.moveToCurrentRow();
    }

    static void update(CachedRowSet cachedRowSet) throws SQLException {
        System.out.println("Update row ...");
        cachedRowSet.absolute(3);
        cachedRowSet.updateString("name", "Quan ka");
        cachedRowSet.updateRow();
    }

    static  void delete(CachedRowSet cachedRowSet) throws SQLException {
        System.out.println("delete row... ");
        cachedRowSet.last();
        cachedRowSet.deleteRow();
    }




}
