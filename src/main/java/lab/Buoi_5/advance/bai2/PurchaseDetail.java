package lab.Buoi_5.advance.bai2;

import java.util.Objects;

public class PurchaseDetail {
    private int IdPurchase;
 private int IdDetail;
 private int ItemID;
 private int Amount;
 private float Price;

    public PurchaseDetail() {
    }

    public PurchaseDetail(int idPurchase, int idDetail, int itemID, int amount, float price) {
        IdPurchase = idPurchase;
        IdDetail = idDetail;
        ItemID = itemID;
        Amount = amount;
        Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseDetail that = (PurchaseDetail) o;
        return IdPurchase == that.IdPurchase && IdDetail == that.IdDetail && ItemID == that.ItemID && Amount == that.Amount && Float.compare(that.Price, Price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdPurchase, IdDetail, ItemID, Amount, Price);
    }

    @Override
    public String toString() {
        return "PurchaseDetail{" +
                "IdPurchase=" + IdPurchase +
                ", IdDetail=" + IdDetail +
                ", ItemID=" + ItemID +
                ", Amount=" + Amount +
                ", Price=" + Price +
                '}';
    }

    public int getIdPurchase() {
        return IdPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        IdPurchase = idPurchase;
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
