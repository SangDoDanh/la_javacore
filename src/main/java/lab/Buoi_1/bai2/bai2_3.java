package lab.Buoi_1.bai2;

public class bai2_3 {
    public static void inDayConSoChanDN(int[] arr) {
        int arrLength = arr.length;
        int start = -1;
        int end = 0;
        int startTmp = 0;
        int max = 0;

        for (int i = 0; i < arrLength; i ++ ) {
            if (arr[i] % 2 != 0) {
                startTmp = i + 1;
                continue;
            }
            if (i - startTmp + 1 >= max) {
                max = i - startTmp + 1;
                end = i;
                start = startTmp;
            }

        }

        // in dãy con tăng dần và dài nhất có tổng lớn hơn 20
        if(start < 0) {
            System.out.println("Not found!");
            return;
        }
        for(int i = start ; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int [] arr = {5, 1, 9, 10,16, 41, 6, 8, 22};
        inDayConSoChanDN(arr);
    }
}
