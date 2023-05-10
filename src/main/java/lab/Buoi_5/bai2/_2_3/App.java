package lab.Buoi_5.bai2._2_3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Student> ts = new TreeSet<>();
        ts.add(new Student("A06338", "AB", 7));
        ts.add(new Student("A07338", "ABC", 7));
        Student stX = new Student("A06338", "ABA", 9);

        // Yêu cầu 1: Tìm kiếm theo code
        System.out.println(ts.contains(stX));

        //Yêu cầu 2: Tìm kiếm theo name
        Set<Student> ts1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        }
        );
        ts1.addAll(ts);

        Student stY = new Student("A063138", "AB", 9);
        System.out.println(ts1.contains(stY));

        /*
            ts1.contains(stY)

            1. contains trong TreeSet sẽ dựa vào compare và equals
                   - nếu compare == 0  so sánh tiếp bằng equals
         */
    }
}
