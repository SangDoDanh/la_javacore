package lab.Buoi_1.bai9;

public class Bai9_2 {
    public static void main(String[] args) {
        String text = "danhsang.it@gmail.com";
        String regex = "^[a-zA-Z][\\w.\\-]+@[a-z]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})*$";
        System.out.println(text.matches(regex));
    }
}
