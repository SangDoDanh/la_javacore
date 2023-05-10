package lab.Buoi_5.bai1._1_2._1_2_2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private Date joinDate;
    public Employee (String firstName, String lastName, Date joinDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(joinDate, employee.joinDate);
    }

    public static void main(String[] args) throws  ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Employee > listEmployees = new ArrayList<>();
        Employee employee1 = new Employee ("Tom", "Eagar", dateFormat.parse("2007-12-03"));
        Employee employee2 = new Employee ("Tom", "Smith", dateFormat.parse("2005-06-20"));
        Employee employee3 = new Employee ("Bill", "Joy", dateFormat.parse("2009-01-31"));
        Employee employee4 = new Employee ("Bill", "Gates", dateFormat.parse("2005-05-12"));
        Employee employee5 = new Employee ("Alice", "Wden", dateFormat.parse("2009-01-22"));
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        listEmployees.add(employee4);
        listEmployees.add(employee5);
        Employee employee = new Employee ("Bill", "Joy" , dateFormat.parse("2009-01-31"));
        Boolean b= listEmployees.contains(employee);

        // ko co equals b = false ngược lại true
    }
}
