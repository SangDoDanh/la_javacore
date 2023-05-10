package lab.Buoi_5.advance.bai1;

import java.util.Objects;

public class NguoiGuiTien implements Comparable<NguoiGuiTien>{
    private int ma;
    private String hoTen;
    private String soDienThoai;
    private String ngaySinh;

    public NguoiGuiTien(int ma, String hoTen, String soDienThoai, String ngaySinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NguoiGuiTien that = (NguoiGuiTien) o;
        return ma == that.ma && Objects.equals(hoTen, that.hoTen) && Objects.equals(soDienThoai, that.soDienThoai) && Objects.equals(ngaySinh, that.ngaySinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ma, hoTen, soDienThoai, ngaySinh);
    }

    @Override
    public String toString() {
        return "NguoiGuiTien{" +
                "ma=" + ma +
                ", hoTen='" + hoTen + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }


    @Override
    public int compareTo(NguoiGuiTien o) {
        return Integer.compare(this.ma, o.ma);
    }
}
