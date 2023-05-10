package lab.Buoi_5.bai3;

import java.util.Map;
import java.util.TreeMap;

public class _3_1 {
    public static void main(String args[]) {
        Map<Integer, String> map = new TreeMap<>();;//new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        //Elements can traverse in any order
        System.out.println("Cách 1");  // duyet qua entry
        for (Map.Entry m : map.entrySet()) {
            System.out.print (m.getKey() + " " + m.getValue()+"; ");
        }

        System.out.println("\nCách 2");
        for (Integer it : map.keySet()) {
            System.out.print (it + " " + map.get(it)+"; ");
        }
    }
}
