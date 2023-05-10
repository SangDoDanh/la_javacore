package lab.Buoi_5.bai2._2_3;

import java.util.Objects;

class Student implements Comparable<Student>{
    public String code;
    private String name;
    public Integer score;

    public Student(String code, String name, Integer score) {
        this.code = code;
        this.score = score;
        this.name = name;
    }
// các phương thức set, get,


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(code, student.code) && Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.code.compareToIgnoreCase(o.getCode());
    }
}