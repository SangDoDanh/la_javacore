package lab.Buoi_7.bai_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//  5.2 Sử dụng orElse() và orElseGet()
// 5.1Sử dụng các phương thức get(), isPresent() và ifPresent()
public class _5_1_and_5_2 {

    private Student getStudent() {
        Student student = new Student("sang");
        return null;
    }
    public void notUsedOptional() {
        Student student = getStudent();
        if(student != null)
            System.out.println(student.getName());
    }

    public void usedOptional() {
        Student student = getStudent();
        Optional<Student> optionalStudent = Optional.of(student);

        // cach 1
        if (optionalStudent.isPresent())
            System.out.println(student.getName());

        // cach 2
        optionalStudent.ifPresent(s -> System.out.println(s.getName()));
    }

    public static List<String> getList() {
        return null;
    }

    public static Optional<List<String>> getList2() {
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {
        // khong su dung optional
        List<String> strings = getList();
        List<String> otpStrings = strings != null ? strings : new ArrayList<>();

        // su dung optional cach 1
        List<String> otp1 = getList2().orElse(new ArrayList<>());

        // su dung optional cach 2
        List<String> opt2 = getList2().orElseGet(() -> new ArrayList<>());

    }
}
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

