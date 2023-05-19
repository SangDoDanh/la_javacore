package lab.Buoi_7.bai1;

public class _1_1 {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawable = () -> System.out.println("Drawing " + width);
        drawable.draw();
    }
}
