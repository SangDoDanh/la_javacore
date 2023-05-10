package lab.Buoi_5.bai1._1_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _1_3_1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Tom", "Peter", "Alice", "Bob", "Sam",
                "Mary", "Jane", "Bill", "Tim", "Kevin");
        System.out.println("Before sorting: " + names);
        // Sắp xếp
        Collections.sort(names);
        System.out.println("After sorting: " + names);
        // Tìm kiếm
        int i= Collections.binarySearch(names, "Bob");
        if (i>=0) {
            System.out.println("Tìm thấy ở vị trí:"+i);
        } else
            System.out.println("Không tìm thấy Bob");

        List<Integer> numbers = Arrays.asList(8, 2, 5, 1, 3, 4, 9, 6, 7, 10);
        System.out.println("Before sorting: " + numbers);
        //Sắp xếp
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);

        /**
         *  kết quả đều là sắp xếp tăng dần
         *  do Integer, String 2 lớp này đều được java implement lại Comparable
         */
    }
}
