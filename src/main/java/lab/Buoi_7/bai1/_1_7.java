package lab.Buoi_7.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1_7 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "book 1", 99.9f));
        products.add(new Product(2, "book 3", 99.9f));
        products.add(new Product(3, "book 2", 99.9f));

        System.out.println("sap xep theo ten sach: ");
        Collections.sort(products, (book1, book2) -> book1.name.compareTo(book2.name));

        products.forEach(product -> System.out.println(product));
    }
}


class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}