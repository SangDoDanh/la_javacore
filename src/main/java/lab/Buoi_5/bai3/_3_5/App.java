package lab.Buoi_5.bai3._3_5;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> mapName = new TreeMap<>();

        mapName.put("Sang", 1);
        mapName.put("Thao", 1);
        mapName.put("Tuan", 1);
        mapName.put("Hung", 1);


        // containKey
        System.out.println(mapName.containsKey("quang"));// false
        System.out.println(mapName.containsKey("Sang"));// true

        //containsValue
        System.out.println(mapName.containsValue(2)); // false
        System.out.println(mapName.containsValue(1)); // true

    }
}
