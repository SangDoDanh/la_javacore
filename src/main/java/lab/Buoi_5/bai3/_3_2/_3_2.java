package lab.Buoi_5.bai3._3_2;

import java.util.HashMap;
import java.util.Map;

public class _3_2 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        // them tu
        dictionary.put("hello", "Xin chao");
        dictionary.put("hi", "Xin chao");
        dictionary.put("sorry", "Xin loi");
        dictionary.put("cat", "con meo");


        // tra cuu tu
        String word = "Xin chao";

        if (dictionary.containsKey(word)) {
            // xem nghia tu "cat"  getKey(key)
            System.out.println("cat : " + dictionary.get("cat"));
        } else if (dictionary.containsValue(word)){
            System.out.println("ket qua: ");
            for (Map.Entry<String, String> w : dictionary.entrySet()) {
                if (w.getValue().contains(word))
                    System.out.println(w.getKey());
            }
        } else {
            System.out.println("[" +word + "]: Khong duoc tim thay trong tu dien.");
        }


    }
}
