package lab.Buoi_5.bai3._3_3;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Word, String> dictionary = new HashMap<>();
        Word w1 = new Word("cat", "n", "con meo");
        Word w2 = new Word("dog", "n", "Xin chao");
        Word w3 = new Word("hello", "n", "xin chao");
        Word w4 = new Word("sorry", "n", "xin loi");
        dictionary.put(w1,w1.getMean());
        dictionary.put(w2,w2.getMean());
        dictionary.put(w3,w3.getMean());
        dictionary.put(w4,w4.getMean());


        // tra cuu tu
        Word w = new Word("dog", "n", "Xin chao");
        Word s = new Word("dodg", "n", "Xin chao");
        System.out.println(isExit(dictionary, w));// true
        System.out.println(isExit(dictionary, s));// flase

        if (dictionary.containsKey(w)) {
            // xem nghia tu
            System.out.println(w.getWord() + ": " + dictionary.get(w));
        } else if (dictionary.containsValue(w.getMean())){
            System.out.println("ket qua: ");
            for (Map.Entry<Word, String> wEntry : dictionary.entrySet()) {
                if (wEntry.getValue().contains(w.getMean())) // containsValue()
                    System.out.println(wEntry.getKey().getWord());
            }
        } else {
            System.out.println("[" +w.getWord() + "]: Khong duoc tim thay trong tu dien.");
        }

    }
    public static boolean isExit(Map<Word, String> dictionary, Word word) {
        return dictionary.containsKey(word);
    }
}
