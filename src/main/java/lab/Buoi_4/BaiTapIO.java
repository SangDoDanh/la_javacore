package lab.java_core_basic.phan4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.Collator;
import java.util.Locale;

public class BaiTapIO {
    public static void main(String[] args) {
        final String PATH_IN = "data/danhsach.txt";
        final String PATH_OUT = "data/danhsachoutput.txt";
        File danhsach = new File(PATH_IN);
        InputStream in = null;
        InputStreamReader isr = null;
        BufferedReader reader = null;
        try {
            int lines = (int) Files.lines(danhsach.toPath()).count();
            String[] danhsachs = new String[lines];
            in = new FileInputStream(danhsach);
            isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            reader = new BufferedReader(isr);

            String str;
            for(int i = 0;; i ++) {
                if((str = reader.readLine()) != null) {
                    danhsachs[i] = str;
                } else {
                    break;
                }
            }

            sortByName(danhsachs);
            writeNow(danhsachs, PATH_OUT);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
                if (isr!= null)
                    isr.close();
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeNow(String[] danhsachs, String pathOut) throws IOException{
        FileOutputStream os = new FileOutputStream(pathOut);
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);
        for (String line : danhsachs) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        ow.close();
        os.close();
    }

    private static void sortByName(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (compareToFullName(arr[j].trim(), arr[j+1].trim()) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

    }

    public static int compareToFullName(String name1, String name2) {
        String fistName1 = "", fistName2 = "", lastName2 = "", lastName1 = "";
        boolean isMultiSpace = name1.indexOf(" ") != name1.lastIndexOf(" ");

        Collator collator = Collator.getInstance(new Locale("vi", "VN"));
        collator.setStrength(Collator.TERTIARY);

        if (!isMultiSpace && !name1.contains(" "))
            return collator.compare(name1, name2);

        fistName1 = name1.substring(name1.lastIndexOf(" "));
        lastName1 = name1.substring(0, name1.lastIndexOf(" "));
        fistName2 = name2.substring(name2.lastIndexOf(" "));
        lastName2 = name2.substring(0, name2.lastIndexOf(" "));

        if(collator.compare(fistName1, fistName2) != 0)
            return collator.compare(fistName1, fistName2);

        return collator.compare(lastName1, lastName2);

    }
}
