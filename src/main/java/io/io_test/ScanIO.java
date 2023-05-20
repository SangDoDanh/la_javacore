package io.io_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScanIO {
    public static void main(String[] args) {

        // doc file
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //ghi file
        try {
            File file = new File("output.txt");
            PrintWriter writer = new PrintWriter(file);

            writer.println("Hello, World!");
            writer.println("This is a sample file.");

            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
