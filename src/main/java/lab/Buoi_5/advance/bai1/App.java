package lab.Buoi_5.advance.bai1;


import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<NguoiGuiTien, Double> bankMap = new TreeMap<>();

        NguoiGuiTien nguoiGuiTien1 = new NguoiGuiTien(1, "Nguyen A", "23467853", "23/11/1995");
        NguoiGuiTien nguoiGuiTien2 = new NguoiGuiTien(2, "Nguyen B", "23467854", "23/11/1997");


        bankMap.put(nguoiGuiTien2, 100d);
        addNewBankMap(bankMap, nguoiGuiTien1);// them chua co trong danh sach
        addNewBankMap(bankMap, nguoiGuiTien2);// them da co trong danh sach

        display(bankMap);
    }

    public static void display(Map<NguoiGuiTien, Double> bankMap) {
        for (Map.Entry<NguoiGuiTien, Double> entry : bankMap.entrySet()) {
            System.out.println(entry.getKey().getHoTen() + " -- " + entry.getValue());
        }
    }

    public static void addNewBankMap(Map<NguoiGuiTien, Double> bankMap, NguoiGuiTien nguoiGuiTien) {
        if (bankMap.containsKey(nguoiGuiTien)) {
           Double money = bankMap.get(nguoiGuiTien) + 100;
           bankMap.put(nguoiGuiTien, money);
        } else {
            bankMap.put(nguoiGuiTien, 100d);
        }

    }
}
