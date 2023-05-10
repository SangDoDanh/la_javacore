package lab.Buoi_1.bai3;

import java.util.Arrays;

public class Bai3_3 {
    public static Integer[] printEvenAndIndex(int[] arr, int total) {
        int arrLength = arr.length;

        Integer[] startEnds = new Integer[arrLength + 1];
        int index = 0;
        int indexTmp = -1;
        int max = 0;
        int maxTmp = 0;

        for (int i = 0; i < arrLength; i++ ) {
            if(arr[i] %2 != 0) {
                index++;
                continue;
            }

            startEnds[index] = i;
            max = Math.max(i-index + 1, max);

            if (indexTmp > -1 && max > maxTmp) {
                maxTmp = max;
            }

            if (i < arrLength - 1) {
                if (arr[i + 1] %2 != 0) {
                    indexTmp = index;
                    maxTmp = max;
                    index = i+1;
                }
            }
        }
        startEnds[arrLength] = max;
        return startEnds;
    }
    public static void main(String[] args) {
        int[] arr = {52, 334, 70, 801, 90, 4, 60, 82, 553};

        Integer[] results = printEvenAndIndex(arr, 100);

        int rsLength = results.length;

        for(int i = 0; i < rsLength - 2; i++) {
            if(results[i] != null) {
                int max = results[i] - i + 1;
                if( max == results[rsLength-1]) {
                    System.out.println("Start: " + i);
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, results[i] + 1)));
                }
            }
        }
    }
}
