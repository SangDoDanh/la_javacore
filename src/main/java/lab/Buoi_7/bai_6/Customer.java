package lab.Buoi_7.bai_6;

import java.util.Objects;

public class Customer {
    private String name;
    private String address;

    public Customer(String n, String c) {
        name = n;
        address = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return address;
    }

    public void setCity(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}