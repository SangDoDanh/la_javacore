package io.models;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends Person {
    private double score;

    public Student() {
    }

    @Override
    public void showInfo() {
        System.out.println("Hi , this is Student");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    public Student(int id, String lastname, String firstname, String address, LocalDate birthday, double score) {
        super(id, lastname, firstname, address, birthday);
        this.score = score;
    }

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
