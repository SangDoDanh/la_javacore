package lab.Buoi_5.bai3._3_4;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<Phone, Integer> phoneMap = new TreeMap<>();

        Phone iphone14 = new Phone(1, 9999, "Iphone 14");
        Phone samSungNode10 = new Phone(2, 9889, "SamSung Note 10");
        Phone iphone13 = new Phone(3, 8999, "Iphone 13");


        phoneMap.put(iphone14, 1);
        phoneMap.put(samSungNode10, 2);
        phoneMap.put(iphone13, 3);

        Phone newPhone = new Phone(2, 9889, "SamSung Note 10");
        // kiem tra có sản phẩm nào có số lượng > 1

        System.out.println(checkQuality(1, phoneMap));// true
        System.out.println(checkQuality(10, phoneMap));// false

        // Them moi
        addNewPhone(iphone13, phoneMap);
    }

    public static void addNewPhone(Phone newPhone, Map<Phone, Integer> mapPhone) {
        if(mapPhone.containsKey(newPhone)) {
            int quality = mapPhone.get(newPhone) + 1;
            mapPhone.put(newPhone, quality);
        }
    }

    // có sản phẩm  nào có số lượng hơn n không
    public static boolean checkQuality(int n, Map<Phone, Integer> mapPhone) {
        for (Map.Entry<Phone, Integer> entryPhone : mapPhone.entrySet()) {
            if (entryPhone.getValue() >= n)
                return true;
        }
        return false;
    }
}
