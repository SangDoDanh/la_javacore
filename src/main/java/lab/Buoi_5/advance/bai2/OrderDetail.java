package lab.Buoi_5.advance.bai2;

import java.util.Objects;

public class OrderDetail {
    private int IdOrder; // mã hoá đơn
    private int IdDetail;// mã hoá đơn chi tiết
    private int ItemID;// mã hàng
    private int Amount;// số lượng hàng
    private float Price; //đơn giá

    public OrderDetail(int idOrder, int idDetail, int itemID, int amount, float price) {
        IdOrder = idOrder;
        IdDetail = idDetail;
        ItemID = itemID;
        Amount = amount;
        Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return IdOrder == that.IdOrder && IdDetail == that.IdDetail && ItemID == that.ItemID && Amount == that.Amount && Float.compare(that.Price, Price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdOrder, IdDetail, ItemID, Amount, Price);
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "IdOrder=" + IdOrder +
                ", IdDetail=" + IdDetail +
                ", ItemID=" + ItemID +
                ", Amount=" + Amount +
                ", Price=" + Price +
                '}';
    }

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int idOrder) {
        IdOrder = idOrder;
    }

    public int getIdDetail() {
        return IdDetail;
    }

    public void setIdDetail(int idDetail) {
        IdDetail = idDetail;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
