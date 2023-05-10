package lab.Buoi_1.bai8;

public class Bai8_3 {
    public static  int demSinhVienTheoHoTen(String[] danhSachSV, String ten, String ho) {
        int result = 0;

        for(String hoVaTen : danhSachSV) {
            String[] hoVaTenArr = hoVaTen.split(" ");
            if(ho.equalsIgnoreCase(hoVaTenArr[0])
                    && ten.equalsIgnoreCase(hoVaTenArr[hoVaTenArr.length -1]))
                result ++;
        }

        return result;
    }
    public static void main(String[] args) {
        String[] danhSachSV = {"Nguyễn v Quân", "Nguyễn v Quân", "Nguyễn v Quân", "Bui Tien Dung", "Đoàn Mạnh Hải"};
        System.out.println(demSinhVienTheoHoTen(danhSachSV, "Quân", "Nguyễn"));
    }
}
