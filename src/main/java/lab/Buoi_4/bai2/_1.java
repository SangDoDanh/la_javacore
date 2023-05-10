package lab.Buoi_4.bai2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _1 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("data/InputFile.txt");
        File outputFile = new File("data/OutputFile.txt");

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1){
            System.out.println(c);
            out.write(c);
        }
        System.out.println("FileReader is used to read a file and FileWriter is used for writing.");

        in.close();
        out.close();
    }
}
