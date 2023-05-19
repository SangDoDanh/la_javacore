package lab.Buoi_7.bai3.bai3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3_2_1_and_3_2_2 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP", 900));
        productList.add(new Product(2, "HP2", 400));
        productList.add(new Product(2, "HP2", 400));
        productList.add(new Product(2, "HP2", 400));
        productList.add(new Product(3, "HP3", 100));
        List<Double> productPriceList;
        // 3.2.1
        productPriceList =
                productList.stream().filter(p -> p.getPrice() >= 300) // loc price >=300
                                    .map(Product::getPrice) // tham chieu phuowng thuc getPrice() cua Product
                                    .collect(Collectors.toList());
        System.out.println(productPriceList);

        // 3.2.2
        productPriceList = productList.stream().filter(product -> product.getPrice() >=300)
                .map(product -> product.getPrice()).collect(Collectors.toList());
        System.out.println(productPriceList);
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
