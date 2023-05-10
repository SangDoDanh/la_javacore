package lab.Buoi_1.bai8;

public class Bai8_2 {
    public static String chuanHoaVanban(String str) {
        String[] strArr = str.split("\\.");
        StringBuffer result = new StringBuffer("");
        StringBuffer results = new StringBuffer("");
        for(String s : strArr) {
            s = s.trim();
            s += ". ";
            result.append(s);
            result.setCharAt(0, (result.charAt(0) + "").toUpperCase().charAt(0));
            results.append(result);
            result.delete(0, result.length());
        }
        return results.substring(0, results.length() - 2).trim();
    }

    public static void main(String[] args) {
        String str = "day la mot doan van mau .day la mot doan van mau2.day la mot doan van mau3.";
        System.out.println(chuanHoaVanban(str));
    }
}
