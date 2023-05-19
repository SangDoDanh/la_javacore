package lab.Buoi_7.bai4;

import lab.Buoi_7.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// 4.1  Convert List into Set
public class _4_1_and_4_2 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP", 900));
        productList.add(new Product(2, "HP2", 400));
        productList.add(new Product(2, "HP3", 400));
        productList.add(new Product(2, "HP4", 400));
        productList.add(new Product(3, "HP5", 100));

        // convert to set
        Set<Double> productPriceSet =
                productList.stream().filter(product -> product.getPrice() > 300)
                        .map(product -> product.getPrice())
                        .collect(Collectors.toSet());
        System.out.println(productPriceSet);

        // convert to set
        Map<Integer, String> productPriceMap =
                productList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
        System.out.println(productPriceMap);
    }
}
