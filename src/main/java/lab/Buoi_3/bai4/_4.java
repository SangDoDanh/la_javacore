package lab.Buoi_3.bai4;

import java.security.InvalidAlgorithmParameterException;

public class _4 {
       static int factorial(int number) throws InvalidAlgorithmParameterException {
            int facto=1;
            if (number > 99) {
                throw new InvalidAlgorithmParameterException("number <=99");

            } else {
                facto = 1;
                int n = 1;
                while (++n <= number) {
                    facto *= n;
                }
            }
            return facto;
        }

    public static void main(String[] args) {

    }
}
