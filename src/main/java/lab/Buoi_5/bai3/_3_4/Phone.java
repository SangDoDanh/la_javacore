package lab.Buoi_5.bai3._3_4;

import java.util.Objects;

public class Phone implements Comparable<Phone>{
    private int id;
    private double price;
    private String name;

    public Phone(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id && Double.compare(phone.price, price) == 0 && Objects.equals(name, phone.name);
    }
}
