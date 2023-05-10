package lab.Buoi_5.advance.bai2;

import java.time.LocalDate;
import java.util.Objects;

public class Purchase implements Comparable<Purchase>{
    private int IdPurchase;// mã đơn nhập hàng
 private LocalDate purDate;// ngày nhập hàng
 private String SupplierID ;// mã nhà cung cấp

    public Purchase() {
    }

    public Purchase(int idPurchase, LocalDate purDate, String supplierID) {
        IdPurchase = idPurchase;
        this.purDate = purDate;
        SupplierID = supplierID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return IdPurchase == purchase.IdPurchase && Objects.equals(purDate, purchase.purDate) && Objects.equals(SupplierID, purchase.SupplierID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdPurchase, purDate, SupplierID);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "IdPurchase=" + IdPurchase +
                ", purDate=" + purDate +
                ", SupplierID='" + SupplierID + '\'' +
                '}';
    }

    public int getIdPurchase() {
        return IdPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        IdPurchase = idPurchase;
    }

    public LocalDate getPurDate() {
        return purDate;
    }

    public void setPurDate(LocalDate purDate) {
        this.purDate = purDate;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String supplierID) {
        SupplierID = supplierID;
    }

    @Override
    public int compareTo(Purchase o) {
        return Integer.compare(this.IdPurchase, o.IdPurchase);
    }
}
