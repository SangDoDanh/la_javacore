package lab.Buoi_1.bai4;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int arrLenght = arr.length;
        int min;

        for (int i = 0; i < arrLenght - 1; i++) {
            min = arr[i + 1];
            int j;

            for (j = i + 1 ; j > 0 && min < arr[j-1]; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = min;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-7, 19, -333, 3, 5, 99, 22};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
