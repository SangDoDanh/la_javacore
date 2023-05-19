package lab.Buoi_7.bai1;

interface AddAble2 {
    int add(int a, int b);
}
public class _1_4 {
    public static void main(String[] args) {
        AddAble2 addAble2;

        // cach 1 su dung return
        addAble2 = (a, b) ->{return  (a + b);};
        System.out.println(addAble2.add(3, 5));

        // cach 2 khong su dung retun
        addAble2 = (int a, int b) -> a + b;
        System.out.println(addAble2.add(3, 5));
    }
}
