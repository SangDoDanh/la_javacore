package lab.Buoi_5.bai1._1_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _1_2_1 {
    public static void main(String args[]) {
        List<String> list1 = new LinkedList<String>();// new ArrayList<String>();//
        list1.add("Ravi");//Adding object in arraylist
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");
        // Cho biết kết quả và giải thích ?
        boolean kq;
        kq = list1.contains(new String("Vijay")); // true
        kq = list1.contains("Vijay"); // true
        List list2 = new ArrayList();
        list2.add(1);
        list2.add(5);
        list2.add(9);
        list2.add(4);
        // Cho biết kết quả và giải thích ?
        kq = list1.contains(5); // false,
                                // nhận được số ro kiểu tham số của contains là Object
                                // vì list1.indexof(5) = -1

    }
}
