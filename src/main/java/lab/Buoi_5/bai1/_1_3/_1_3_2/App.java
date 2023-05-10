package lab.Buoi_5.bai1._1_3._1_3_2;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Person> list = new ArrayList<>();
        Person employee1 = new Person("Tom", "Eagar", dateFormat.parse("2007-12-03"));
        Person employee2 = new Person("Tom", "Smith", dateFormat.parse("2005-06-20"));
        Person employee3 = new Person("Bill", "Joy", dateFormat.parse("2009-01-31"));
        Person employee4 = new Person("Bill", "Gates", dateFormat.parse("2005-05-12"));
        Person employee5 = new Person("Alice", "Wden", dateFormat.parse("2009-01-22"));

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        System.out.println("Before sorting: ");
        System.out.println(list);
        //Yêu cầu 1:
        //1.1: Sắp xếp theo joinDate
        Collections.sort(list); //
        System.out.println("After sorting1: ");
        System.out.println(list);
        Person employee = new Person("Bill", "Joy", dateFormat.parse("2009-01-31"));
        //1.2: Thực hiện tìm kiếm
        handelSearch(list, employee);

        // Yêu cầu 2
        // 2.1: Sắp xếp theo firstName và lastName
        Collections.sort(list, (o1, o2) -> {
            int firstNameCompare = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            if (firstNameCompare == 0)
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            return firstNameCompare;
        });
        System.out.println("After sorting2: ");
        System.out.println(list);
        //2.2: Thực hiện tìm kiếm
        //1.2: Thực hiện tìm kiếm
        handelSearch(list, employee);
    }

    public static void handelSearch(List<Person> list, Person person) {
        int i = Collections.binarySearch(list, person);

        if (i>=0) {
            System.out.println("Tìm thấy ở vị trí:"+i);
        } else
            System.out.println("Không tìm thấy " + person);
    }
}
