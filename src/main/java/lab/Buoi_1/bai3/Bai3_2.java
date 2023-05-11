package lab.Buoi_1.bai3;

import java.util.Arrays;

public class Bai3_2 {
    public static Integer[] printTotalAndIndex(int[] arr, int total) {
        int arrLength = arr.length;

        Integer[] startEnds = new Integer[arrLength];
        int index = 0;
        int indexTmp = -1;
        int max = 0;
        int maxTmp = 0;
        int sum = 0;

        for (int i = 0; i < arrLength; i++) {
            sum += arr[i];
            if (sum >= total) {
                startEnds[index] = i;
            }
            max = Math.max(i - index + 1, max);

            if (indexTmp > -1 && max > maxTmp && sum >= total) {
                maxTmp = max;
                startEnds = new Integer[arrLength];
                startEnds[index] = i;
            }

            if (i < arrLength - 1) {
                if (arr[i + 1] < arr[i]) { // bat dau mot chuoi moi
                    indexTmp = index;
                    maxTmp = max;
                    index = i + 1;
                    sum = 0;
                }
            }
        }
        return startEnds;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 70, 80, 90, 4, 60, 88, 553};

        Integer[] results = printTotalAndIndex(arr, 100);

        int rsLength = results.length;

        for (int i = 0; i < rsLength - 1; i++) {
            if (results[i] != null) {
                System.out.println("Start: " + i);
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, results[i] + 1)));
            }
        }
    }
}
