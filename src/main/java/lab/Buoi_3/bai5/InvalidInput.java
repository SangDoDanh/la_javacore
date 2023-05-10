package lab.Buoi_3.bai5;

import java.util.Scanner;

public class InvalidInput extends Exception {
    static int factorial(int number) throws InvalidInput {
        int facto;
        if (number > 99) {
            throw new InvalidInput("number <= 99");
        } else {
            facto = 1;
            int n = 1;
            while (++n <= number) {
                facto *= n;
            }
        }
        return facto;
    }

    public InvalidInput(String message) {
        super(message);
    }

    public static void main(String [] args) {
        int inputX = 5, result;

        // nhập dữ liệu cho inputX
        try {
            result = factorial( inputX);

        } catch (InvalidInput e) {
            System.out.println(e.getMessage());
        }
    }

}
