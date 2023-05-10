package lab.Buoi_1.bai4;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr ) {
        int arrLength = arr.length;
        int min;
        int indexMin, temp;
        for (int i = 0; i < arrLength - 1; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i + 1; j < arrLength; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            if(indexMin != i) {
                temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-7, 19, -333, 3, 5, 99, 22};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
