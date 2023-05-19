package lab.Buoi_7.bai1;

import java.util.ArrayList;
import java.util.List;

public class _1_5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.forEach(s -> System.out.println(s));
    }
}
