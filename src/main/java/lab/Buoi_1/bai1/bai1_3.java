package lab.Buoi_1.bai1;

public class bai1_3 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean arrIsPrime(int [] arr) {
        for (int num : arr) {
            if (!isPrime(num))
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int [] A = {5, 1, 9, 10, 16};
        int [] B = {2, 3, 5, 7, 11};

        System.out.println(arrIsPrime(A)); // false
        System.out.println(arrIsPrime(B)); // true
    }
}
