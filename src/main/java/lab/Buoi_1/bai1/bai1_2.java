package lab.Buoi_1.bai1;

public class bai1_2 {
    public static boolean kiemTraMangDanDau(int[] arr) {
        int lengthArr = arr.length;

        if (lengthArr == 0)
            return false;

        for (int i = 0; i < lengthArr - 1; i++) {
            if (arr[i] * arr[i + 1] > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, -4, 5};
        int[] arr2 = {-2, 34, -35, 40, -55};
        int[] arr3 = {1, 8, 3, 4, 5};

        System.out.println(kiemTraMangDanDau(arr1));   //true
        System.out.println(kiemTraMangDanDau(arr2));   //true
        System.out.println(kiemTraMangDanDau(arr3));   //false
    }
}
