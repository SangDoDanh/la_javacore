package lab.Buoi_1.bai9;

public class Bai9_1 {
    public static void main(String[] args) {
        String text = "Luvina99";
        String regex = "[^\\s:]{6,12}$";

        System.out.println(text.matches(regex));
    }
}
