package lab.Buoi_4.bai5;

import java.io.Serializable;

public class Bike implements Serializable {
    private String name;
    private int id;
    private String price;

    public Bike() {
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price='" + price + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Bike(String name, int id, String price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
