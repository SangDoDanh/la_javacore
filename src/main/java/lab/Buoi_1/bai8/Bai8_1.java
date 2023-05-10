package lab.Buoi_1.bai8;



public class Bai8_1 {

    public static void main(String[] args) {
        String str = "doan van mau1, day la mot doan van thu 3, day la mot doan van thu 2. day la mot doan van thu 2. doan3 ne? doan van thu 4.";
        String[] results = strHandler(str);

        for(String s : results) {
            if(s != null)
                System.out.println(s);
        }
    }

    private static String[] strHandler(String str) {
        String[] strArr = str.split("[,?\\.]");
        int arrLength = strArr.length;
        String[] results = new String[arrLength];
        int index = 0;
        int max = 0;

        for (String s: strArr) {
            if(s.length() >= max) {
                if (s.length() > max) {
                    max = s.length();
                    results = new String[arrLength];
                    index = 0;
                    results[index] = s;
                } else if(!results[index].equals(s)) {
                    index += 1;
                    results[index] = s;
                }
            }

        }

        return results;
    }
}
