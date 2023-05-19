package lab.Buoi_1.bai3;

import java.util.Arrays;

public class Bai3_1 {
    public static Integer[] inTatCaDayConTangDanKemViTri(int[] arr) {
        int arrLength = arr.length;

        Integer[] startEnds = new Integer[arrLength];
        int index = 0;
        int indexTmp = -1;
        int max = 0;
        int maxTmp = 0;

        for (int i = 0; i < arrLength; i++ ) {
            startEnds[index] = i;
            max = Math.max(i - index + 1, max);

            if (indexTmp > -1 && max > maxTmp) {
               maxTmp = max;
               startEnds = new Integer[arrLength];
               startEnds[index] = i;
            }
            if (i < arrLength - 1) {
                if (arr[i + 1] < arr[i]) {
                    indexTmp = index;
                    maxTmp = max;
                    index = i+1;
                }
            }
        }
        System.out.println(max);
        return startEnds;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 8, 9, 34, 6, 8, 36, 4, 6, 8, 36, 45, 4, 6, 8, 36, 45, 55};
        Integer[] result = inTatCaDayConTangDanKemViTri(arr);
        int rsLength = result.length;

        for(int i = 0; i < rsLength ; i++) {
            if(result[i] != null) {
                System.out.println("Start: " + i);
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, result[i] + 1)));
            }
        }
    }
}
