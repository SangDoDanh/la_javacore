package lab.Buoi_3.bai1;
import javax.swing.JOptionPane;
public class _1_2 {

    public static void main(String[] args) {
        // Enter the following values and see what exception is caught.
        //    0, 4, character, <no value>
        try {

            String value = JOptionPane.showInputDialog(null, "Enter value:");

            // Nếu giá trị nhập vào không phải là số sẽ xảy ra ngoại lệ NumberFormatException
            int divisor = Integer.parseInt(value);

            // If the divisor is 0, it will result in ArithmetricException
            System.out.println(3/divisor);

        } catch ( NumberFormatException ex){
            System.out.println("Gia tri truyen vao phai la mot so");
        } catch (ArithmeticException ex) {
            System.out.println("Khong the chia cho 0");
        }
        System.out.println("After exception.");

    }
}
