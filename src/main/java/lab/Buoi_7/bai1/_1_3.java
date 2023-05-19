package lab.Buoi_7.bai1;
interface AddAble {
    int add(int a, int b);
}
public class _1_3 {
    public static void main(String[] args) {
        // cach 1
        AddAble addAble = (a, b) -> a + b;
        System.out.println(addAble.add(3, 5));

        // cach 2
        AddAble addAble2 = (int a, int b) -> a + b;
        System.out.println(addAble.add(3, 5));
    }
}
