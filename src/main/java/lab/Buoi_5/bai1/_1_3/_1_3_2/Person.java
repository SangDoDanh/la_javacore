package lab.Buoi_5.bai1._1_3._1_3_2;

import java.util.*;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private Date joinDate;

    public Person(String firstName, String lastName, Date joinDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
    }
    // các phương thức set, get, toString, ….

    @Override
    public String toString() {
        return "{firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joinDate=" + joinDate + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(joinDate, person.joinDate);
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
    public int compareTo(Person o) {
        return this.joinDate.compareTo(o.joinDate);
    }
}


