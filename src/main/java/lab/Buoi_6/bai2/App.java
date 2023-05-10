package lab.Buoi_6.bai2;

import lab.Buoi_6.DB;

import java.sql.*;
import java.time.LocalDate;

public class App {

    public static  final String CREATE_STRING = "CREATE TABLE Persons (\n" +
            "    PersonID int auto_increment primary key,\n" +
            "    LastName varchar(255),\n" +
            "    FirstName varchar(255),\n" +
            "    Address varchar(255),\n" +
            "    City varchar(255),\n" +
            "    birthday date\n" +
            ");";

    public static void main(String[] args) throws SQLException{
        DB db = new DB();
        Connection conn = db.connectDatabase();
//        createTable(conn, CREATE_STRING);
//        insertPrepareStatement(conn);
//        selectPrepareStatement(conn);
        deletePrepareStatement(conn);
//        updatePrepareStatement(conn);
    }

    // 2.1. Tạo bảng
    public static void createTable(Connection connection, String createString) throws SQLException {
        Statement stm;
        stm = connection.createStatement();
        stm.executeUpdate(createString);
        stm.close();
    }

    // 2.2. Chèn dữ liệu
    public static void insertPrepareStatement(Connection conn) throws SQLException {
        String insertQuery = "INSERT INTO Persons VALUES(?, ?, ?, ?, ?, ?);";
        if (conn != null) {
            Date date = Date.valueOf(LocalDate.of(1995, 11, 23));
            PreparedStatement pstm = conn.prepareStatement(insertQuery);
            pstm.setInt(1, 1);
            pstm.setString(2, "Nguyen");
            pstm.setString(3, "A");
            pstm.setString(4, "25 Lien khue, Dong Da, Ha Noi");
            pstm.setString(5, "Ha Noi");
            pstm.setDate(6, date);
            pstm.executeUpdate();
            pstm.setInt(1, 2);
            pstm.setString(2, "Nguyen");
            pstm.setString(3, "B");
            pstm.setString(4, "45 Lien khue, Go Vap, HCM");
            pstm.setString(5, "HCM");
            pstm.setDate(6, date);
            pstm.executeUpdate();
            pstm.close();
        }
    }

    // 2.3 Truy van
    public static void selectPrepareStatement(Connection conn)  throws SQLException{
        if(conn != null) {
            String query = "Select * from persons where PersonID=?;";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 1);

            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("LastName") + resultSet.getString("FirstName");
                String city = resultSet.getString("City");
                System.out.println("name: " + name + "\tcity: "+ city);
            }
            pstm.close();
        }
    }

    // 2.4. Cập nhật

    public static void updatePrepareStatement(Connection connection) throws SQLException{
        if (connection != null) {
            String query = "update persons\n" +
                    "set City = ? \n" +
                    "where PersonID = ?";
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setInt(2,1);
            pstm.setString(1, "Lao Cai");
            pstm.executeUpdate();
            pstm.close();
        }
    }

    public static void deletePrepareStatement(Connection connection) throws SQLException{
        if (connection != null) {
            String query = "delete from persons\n" +
                    "where PersonID = ?";
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setInt(1,1);
            pstm.executeUpdate();
            pstm.close();
        }
    }

}
