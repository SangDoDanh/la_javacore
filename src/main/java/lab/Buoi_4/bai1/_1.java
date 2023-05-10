package lab.Buoi_4.bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _1 {
    public static void main(String[] args)throws IOException {
        File inputFile = new File("data/InputFile.txt");
        File outputFile = new File("OutputFile.txt");
        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int c;

        while ((c = in.read())!= -1) {
            System.out.println((char) c);
            out.write(c);
        }
        System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");

        in.close();
        out.close();
    }
}
