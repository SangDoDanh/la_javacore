package lab.Buoi_1.bai3;

import java.util.Arrays;

public class Bai3_1 {
    public static Integer[] inTatCaDayConTangDanKemViTri(int[] arr) {
        int arrLength = arr.length;

        Integer[] startEnds = new Integer[arrLength + 1];
        int index = 0;
        int indexTmp = -1;
        int max = 0;
        int maxTmp = 0;

        for (int i = 0; i < arrLength; i++ ) {
            startEnds[index] = i;
            max = Math.max(i - index + 1, max);

            if (indexTmp > -1 && max > maxTmp) {
               maxTmp = max;
            }
            if (i < arrLength - 1) {
                if (arr[i + 1] < arr[i]) {
                    indexTmp = index;
                    maxTmp = max;
                    index = i+1;
                }
            }
        }
        startEnds[arrLength] = max;
        System.out.println(max);
        return startEnds;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 8, 9, 4, 6, 8, 36, 4, 6, 8, 36, 45};
        Integer[] result = inTatCaDayConTangDanKemViTri(arr);
        int rsLength = result.length;

        for(int i = 0; i < rsLength - 2; i++) {
            if(result[i] != null) {
                int max = result[i] - i + 1;
                if( max == result[rsLength-1]) {
                    System.out.println("Start: " + i);
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, result[i] + 1)));
                }
            }
        }
    }
}
