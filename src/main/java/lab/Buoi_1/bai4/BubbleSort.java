package lab.Buoi_1.bai4;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swapped = false;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 3, 3, 5, 9, 22};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
