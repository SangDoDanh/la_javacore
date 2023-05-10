package lab.Buoi_4.bai3;

public class _1 {
    public static void main(String[] args) {
        String a0, a1, a2;
        a0 = "data/words.txt";
        a1 = "data/wordsout.txt";
        a2 = "3";
        SimpleEncryption se = new SimpleEncryption();
        se.encrypt(a0, a1, Integer.parseInt(a2));
        System.out.println("Hiển thị file đã bị mã hóa");
        se.viewFileContent(a1);
    }
}
