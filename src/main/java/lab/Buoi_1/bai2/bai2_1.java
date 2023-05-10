package lab.Buoi_1.bai2;

public class bai2_1 {
    public static void inDayConTDDN(int[] arr) {
        int arrLength = arr.length;
        int start = 0;
        int startTmp = 0;
        int end = 0;
        int maxLength = 0;

        for (int i = 0; i < arrLength; i ++ ) {
            if (i - startTmp + 1 > maxLength) {
                end = i;
                start = startTmp;
            }
            if (i < arrLength - 1) {
                if (arr[i + 1] <= arr[i]) {
                    maxLength = Math.max(i - startTmp + 1, maxLength);
                    startTmp = i + 1;
                }
            }
        }

        // in dãy con tăng dần và dài nhất
        for(int i = start ; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {5, 1, 9, 10, 16, 4, -6, 8, 9, -11, 12, 33};
        inDayConTDDN(arr);
    }
}
