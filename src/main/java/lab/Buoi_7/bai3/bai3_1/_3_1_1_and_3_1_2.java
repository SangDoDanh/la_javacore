package lab.Buoi_7.bai3.bai3_1;

import java.util.ArrayList;
import java.util.List;


public class _3_1_1_and_3_1_2 {

    public static void main(String[] args) {
        // loc du lieu khong su dung stream
        List<Product> productList = new ArrayList<>();
        int count = 0; // so product lon hon 300
        productList.add(new Product(1, "HP", 900));
        productList.add(new Product(2, "HP2", 400));
        productList.add(new Product(2, "HP2", 400));
        productList.add(new Product(2, "HP2", 400));
        productList.add(new Product(3, "HP3", 100));
        for (Product product: productList) {
            if(product.getPrice() >= 300) {
                count ++;
            }
        }
        System.out.println("So product co price >= 300 not stream: " + count);


        // loc du lieu  su dung stream
        count = (int) productList.stream().filter(product -> product.getPrice() >= 300).count();

        System.out.println("So product co price >= 300 su dung stream: " + count);


    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", price=" + price ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
