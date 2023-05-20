package io.io_test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("./data/test.txt"));
        sc.useDelimiter(",");
        List<Integer> integers = new ArrayList<>();

        while (sc.hasNextInt()) {
            integers.add(sc.nextInt());
        }
        sc.close();
        Integer[] integerArray = integers.toArray(new Integer[0]);

        System.out.println(integers);
        System.out.println(Arrays.toString(integerArray));
    }
}
