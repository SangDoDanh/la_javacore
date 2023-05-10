package lab.Buoi_1.bai2;

public class bai2_2 {


    public static void InDayConTongHon20TDDN(int[] arr) {
        int arrLength = arr.length;
        int start = 0;
        int end = 0;
        int startTmp = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arrLength; i ++ ) {
            sum += arr[i];
            if (sum >= 20 && i - startTmp + 1 >= max) {

                end = i;
                start = startTmp;
            }
            if (i < arrLength - 1) {
                if (arr[i + 1] <= arr[i]) {
                    max = Math.max(i - startTmp + 1, max);
                    startTmp = i + 1;
                    sum = 0;
                }
            }
        }

        // in dãy con tăng dần và dài nhất có tổng lớn hơn 20
        for(int i = start ; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {5, 16, 1, 2, 3, 4, 1, 16, 21, 3};
        InDayConTongHon20TDDN(arr);
    }
}
