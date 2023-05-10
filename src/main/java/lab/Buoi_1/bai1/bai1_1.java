package lab.Buoi_1.bai1;

public class bai1_1 {
    public static boolean kiemTraMangTangDan(int[] arr) {
        int lengthArr = arr.length;

        if (lengthArr < 1)
            return false;

        for (int i = 0; i < lengthArr - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 34, 35, 40, 55};
        int[] arr3 = {1, 8, 3, 4, 5};

        System.out.println(kiemTraMangTangDan(arr1));   //true
        System.out.println(kiemTraMangTangDan(arr2));   //true
        System.out.println(kiemTraMangTangDan(arr3));   //false
    }
}
