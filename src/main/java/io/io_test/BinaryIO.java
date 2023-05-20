package io.io_test;

import io.models.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class BinaryIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // ghi doi tuong
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(5));
//        students.add(new Student(4));
//        students.add(new Student(35));
//        students.add(new Student(2));
//        FileOutputStream fileOutputStream = new FileOutputStream("./data/student.txt");
//        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
//
//        outputStream.writeObject(students);
//        outputStream.close();

        // doc toi tuong
        List<Student> students1 = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream("./data/student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        students1 = (List<Student>) objectInputStream.readObject();
        students1.stream().map(s -> s.getScore()).forEach(System.out::println);
        objectInputStream.close();

    }
}
