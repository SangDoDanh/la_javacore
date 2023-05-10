package lab.Buoi_6.bai3._3_5;

import lab.Buoi_6.DB;

import java.sql.*;

public class TransactDemo {
    private Connection conn;

    public void connect() {
        this.conn = new DB().connectDatabase();
    }

    public void disconnect() {
        try {
            if (this.conn != null)
                this.conn.close();
            System.out.println("Closed.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void saveOrder(int productId, Date orderDate, float amount, int reportMonth) {
        PreparedStatement orderStatement = null;
        PreparedStatement saleStatement = null;
        try {
            conn.setAutoCommit(false);
            String sqlSaveOrder = "insert into orders (product_id, order_date, amount)";
            sqlSaveOrder += " values (?, ?, ?)";

            String sqlUpdateTotal = "update monthly_sales set total_amount = total_amount + ?";
            sqlUpdateTotal += " where product_id = ? and report_month = ?";

            orderStatement = conn.prepareStatement(sqlSaveOrder);
            saleStatement = conn.prepareStatement(sqlUpdateTotal);

            orderStatement.setInt(1, productId);
            orderStatement.setDate(2, orderDate);
            orderStatement.setFloat(3, amount);

            saleStatement.setFloat(1, amount);
            saleStatement.setInt(2, productId);
            saleStatement.setInt(3, reportMonth);

            orderStatement.executeUpdate();
            saleStatement.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Rolled back.");
                } catch (SQLException exrb) {
                    exrb.printStackTrace();
                }
            }
        } finally {
            try {
                if (orderStatement != null) {
                    orderStatement.close();
                }

                if (saleStatement != null) {
                    saleStatement.close();
                }

                conn.setAutoCommit(true);
            } catch (SQLException excs) {
                excs.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        TransactDemo demo = new TransactDemo();
        int productId = 1;
        int reportMonth = 7;
        Date date = new Date(System.currentTimeMillis());
        float amount = 580;
        demo.connect();
        demo.saveOrder(productId, date, amount, reportMonth);
        demo.disconnect();
    }
}