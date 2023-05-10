package lab.Buoi_5.advance.bai2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Order implements Comparable<Order>{
    private int IdOrder;
    private LocalDate ordDate;
    private String customerID;

    public Order() {
    }

    public Order(int idOrder, LocalDate ordDate, String customerID) {
        IdOrder = idOrder;
        this.ordDate = ordDate;
        this.customerID = customerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return IdOrder == order.IdOrder && Objects.equals(ordDate, order.ordDate) && Objects.equals(customerID, order.customerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdOrder, ordDate, customerID);
    }

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int idOrder) {
        IdOrder = idOrder;
    }

    public LocalDate getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(LocalDate ordDate) {
        this.ordDate = ordDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "IdOrder=" + IdOrder +
                ", ordDate=" + ordDate +
                ", customerID='" + customerID + '\'' +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.IdOrder, o.IdOrder);
    }
}
