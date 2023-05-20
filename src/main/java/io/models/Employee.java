package io.models;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person{

    private double salary;

    public Employee() {
    }

    public Employee(int id, String lastname, String firstname, String address, LocalDate birthday, double salary) {
        super(id, lastname, firstname, address, birthday);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getId() + "," +
                this.getLastname() + "," +
                this.getFirstname() + "," +
                this.getAddress() + "," +
                this.getBirthday() + "," +
                this.getSalary();
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && ((Employee) o).getId() == this.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    @Override
    public void showInfo() {
        String[] arrEm = this.toString().split(",");
        StringBuffer stringBuffer = new StringBuffer();

        for (String s : arrEm) {
            stringBuffer.append(s + "\t");
        }
        System.out.println(stringBuffer);
    }




}
