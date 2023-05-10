package lab.Buoi_5.advance.bai2;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private String IdCus;// mã khach hang
    private String Name;
    private String Address;
    private String Tel;

    public Customer() {
    }

    public Customer(String idCus, String name, String address, String tel) {
        IdCus = idCus;
        Name = name;
        Address = address;
        Tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(IdCus, customer.IdCus) && Objects.equals(Name, customer.Name) && Objects.equals(Address, customer.Address) && Objects.equals(Tel, customer.Tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdCus, Name, Address, Tel);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "IdCus='" + IdCus + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }

    public String getIdCus() {
        return IdCus;
    }

    public void setIdCus(String idCus) {
        IdCus = idCus;
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

    @Override
    public int compareTo(Customer o) {
        return this.getIdCus().compareTo(o.IdCus);
    }
}
