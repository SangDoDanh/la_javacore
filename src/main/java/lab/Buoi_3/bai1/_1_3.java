package lab.Buoi_3.bai1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _1_3 {
    private int [] arr;
    private static final int SIZE = 10;
    public _1_3() {
        arr = new int [SIZE];
        for (int i = 0; i < SIZE; i++)
            arr[i]=i;
    }
    public  void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < (SIZE + 1) ; i++)
                System.out.println("Value at: " + i + " = " + arr[i]);
        } catch (IOException ex) {
            System.out.println("Khong tim thay file");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Truy xuat phan tu ngoai mang");
        } finally {
            if (out != null) {
                System.out.println("Finally: Closing PrintWriter");
                out.close();
            } else {
                System.out.println("Finally: PrintWriter not open");
            }
        }
    }
    public static void main(String[] args) {
        _1_3 lst= new _1_3();
        lst.writeList();
    }
}
