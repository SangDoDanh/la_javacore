package lab.Buoi_7.bai_7;

import java.util.Objects;

public class Supplier {
    private String IdSup;// mã nhà cung cấp
    private String Name;
    private String Address;
    private String Tel;

    public Supplier() {
    }

    public Supplier(String idSup, String name, String address, String tel) {
        IdSup = idSup;
        Name = name;
        Address = address;
        Tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(IdSup, supplier.IdSup) && Objects.equals(Name, supplier.Name) && Objects.equals(Address, supplier.Address) && Objects.equals(Tel, supplier.Tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdSup, Name, Address, Tel);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "IdSup='" + IdSup + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }

    public String getIdSup() {
        return IdSup;
    }

    public void setIdSup(String idSup) {
        IdSup = idSup;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }
}
