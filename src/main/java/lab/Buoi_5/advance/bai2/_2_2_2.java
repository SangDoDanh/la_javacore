package lab.Buoi_5.advance.bai2;

import java.time.LocalDate;
import java.util.*;

public class _2_2_2 {
    public static Map<Supplier, Map<Purchase, List<PurchaseDetail>>> supplierMapMap;

    static {
        supplierMapMap = new HashMap<>();
        // tao Supplier
        Supplier supplier1 = new Supplier("sus1", "Supplier1", "HN", "222222");
        Supplier supplier2 = new Supplier("sus2", "Supplier1", "DN", "333333");

        // tao Purchase
        Purchase purchase1 = new Purchase(1, LocalDate.now(), "sus1");
        Purchase purchase2 = new Purchase(2, LocalDate.now(), "sus2");

        // tao purchaseDetail
        PurchaseDetail purchaseDetail1 = new PurchaseDetail(1, 1, 1, 3, 20);
        PurchaseDetail purchaseDetail2 = new PurchaseDetail(1, 2, 2, 2, 30);
        PurchaseDetail purchaseDetail3 = new PurchaseDetail(2, 3, 1, 3, 40);

        // tao danh sach OrderDetail
        List<PurchaseDetail> purchaseDetails1 = new ArrayList<>();
        List<PurchaseDetail> purchaseDetails2 = new ArrayList<>();
        purchaseDetails1.add(purchaseDetail1);
        purchaseDetails1.add(purchaseDetail2);
        purchaseDetails2.add(purchaseDetail3);

        // tao danh sach order
        Map<Purchase, List<PurchaseDetail>> purchaseMap1 = new TreeMap<>();
        Map<Purchase, List<PurchaseDetail>> purchaseMap2 = new TreeMap<>();
        purchaseMap1.put(purchase1, purchaseDetails1);
        purchaseMap2.put(purchase2, purchaseDetails2);

        // tao danh sach khach hang
        supplierMapMap.put(supplier1, purchaseMap1);
        supplierMapMap.put(supplier2, purchaseMap2);
    }

    public static void main(String[] args) {
        // Thực hành tìm kiếmCác đơn nhập hàng theo mã nhà cung cấp
        searPurchaseBySupplierId("sus1");
        searPurchaseBySupplierId("sus2");

        // In raCác nhà cung cấp có tổng giá trị hóa đơn cao nhất
        bestPurchasesByTotal();

        // In raCác nhà cung cấp có số lượng hóa đơn nhiều nhất
        bestPurchasesByOrder();
    }


    // In raCác nhà cung cấp có tổng giá trị hóa đơn cao nhất
    public static void bestPurchasesByTotal() {
        Map<Supplier, Double> totalMap = totalOrderBySupplier();
        if (totalMap.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            double max = totalMap.get(null);
            totalMap.remove(null);
            System.out.println("Các nhà cung cấp có tổng giá trị hóa đơn cao nhất:");
            for (Map.Entry<Supplier, Double> entry : totalMap.entrySet()) {
                if (entry.getValue() == max)
                    System.out.println(entry.getKey().getName() + " : " + max);
            }
        }

    }

    //  In raCác nhà cung cấp có số lượng hóa đơn nhiều nhất
    public static void bestPurchasesByOrder() {
        Map<Supplier, Integer> countMap = countPurchaseBySupplier();

        if (countMap.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            int max = countMap.get(null);
            countMap.remove(null);
            System.out.println("Các Nha cung cap nhap hang nhieu nhat: ");
            for (Map.Entry<Supplier, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == max)
                    System.out.println(entry.getKey().getName() + " : " + max);
            }
        }

    }

    public static Map<Supplier, Double> totalOrderBySupplier() {

        Map<Supplier, Double> totalMap = new HashMap<>();
        double max = 0;
        double total = 0;
        for (Map.Entry<Supplier, Map<Purchase, List<PurchaseDetail>>> entryCus : supplierMapMap.entrySet()) {
            for (Map.Entry<Purchase, List<PurchaseDetail>> entryOrder : entryCus.getValue().entrySet()) {
                for (PurchaseDetail od : entryOrder.getValue()) {
                    total += (od.getAmount() * od.getPrice());
                }
            }
            max = Math.max(max, total);
            totalMap.put(entryCus.getKey(), total);
            total = 0;
        }
        totalMap.put(null, max);
        return totalMap;
    }

    public static Map<Supplier, Integer> countPurchaseBySupplier() {
        Map<Supplier, Integer> totalMap = new HashMap<>();
        int max = 0;
        int total;
        for (Map.Entry<Supplier, Map<Purchase, List<PurchaseDetail>>> entryCus : supplierMapMap.entrySet()) {
            total = entryCus.getValue().size();
            max = Math.max(max, total);
            totalMap.put(entryCus.getKey(), total);
        }
        totalMap.put(null, max);
        return totalMap;
    }

    // Thực hành tìm kiếmCác đơn nhập hàng theo mã nhà cung cấp
    public static void searPurchaseBySupplierId(String susId) {

        if (supplierMapMap.isEmpty())
            System.out.println("Danh sach trong");
        else {
            Set<Purchase> purchaseSet = new HashSet<>();

            for (Map.Entry<Supplier, Map<Purchase, List<PurchaseDetail>>> entryCus : supplierMapMap.entrySet()) {
                if (susId.equals(entryCus.getKey().getIdSup())) {
                    purchaseSet = entryCus.getValue().keySet();
                }
            }

            if (purchaseSet.isEmpty()) {
                System.out.println("Danh sach trong");
            } else {
                for (Purchase purchase : purchaseSet) {
                    System.out.println(purchase);
                }
            }
        }
    }
}
