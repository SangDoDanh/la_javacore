package lab.Buoi_3.bai3;

public class _3 {
    public static void test() {
        int[] a = new int[5];
        try{

            a[5] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Khong the truy cap den phan tu ngoai bien cua mang");
        } catch (ArithmeticException ex) {
            System.out.println("Khong the chia mot so cho khong");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        test();
    }
}
