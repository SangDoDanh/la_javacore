package lab.Buoi_3.bai1;

public class _1_1 {
    public static void main(String[] args) {
            try {
                System.out.println(3/0);
            } catch (ArithmeticException ex) {
                System.out.println("KHong the chia cho khong");
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }
}
