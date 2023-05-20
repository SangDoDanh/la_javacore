package lab.Buoi_7.bai_7;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class _7_1 {
    static Map<Order, List<OrderDetail>> tm;
    static Map<Customer, Map<Order, List<OrderDetail>>> hm;

    public static void main(String[] args) {
//        7.1. Cho cấu trúc sau
//        Map< Order, ArrayList<OrderDetail>> tm = new TreeMap<>();
//        Hãy sử dụng các Stream API để tìm tất cả các hóa đơn có tổng số lượng lớn nhất.


        int max = tm.entrySet()
                .stream()
                .map(e -> e.getValue()
                        .stream()
                        .mapToInt(OrderDetail::getAmount).sum())
                .max(Comparator.comparingInt(oAmount -> oAmount))
                .orElse(0);

        tm.entrySet().stream()
                .filter(e -> max == (e.getValue()
                        .stream()
                        .mapToInt(OrderDetail::getAmount).sum())
                ).forEach(System.out::println);


////        7.2. Cho cấu trúc sau
//        HashMap<Customer, TreeMap<Order, ArrayList<OrderDetail>>> hm
//                = new HashMap<>();
//        Hãy sử dụng các Stream API để tìm tất cả các khách hàng có tổng số tiền mua
//        hàng lớn nhất.

        double maxTotal =
        hm.entrySet().stream().map(
                customerMapEntry -> customerMapEntry.getValue().entrySet().stream()
                        .flatMap(orderListEntry -> orderListEntry.getValue().stream())
                        .map(orderDetail -> orderDetail.getPrice() * orderDetail.getAmount())
                        .mapToDouble(aDouble -> aDouble).sum()
        ).mapToDouble(aDouble -> aDouble).max().orElse(0);

        System.out.println("maxTotal: " +maxTotal);
        hm.entrySet().stream().filter(
                customerMapEntry -> maxTotal == (customerMapEntry.getValue().entrySet().stream()
                        .flatMap(orderListEntry -> orderListEntry.getValue().stream())
                        .map(orderDetail -> orderDetail.getPrice() * orderDetail.getAmount())
                        .mapToDouble(aDouble -> aDouble).sum())
        ).forEach(System.out::println);


    }

    static {
        tm = new TreeMap<>();
        hm = new HashMap<>();

        // tao khach hang
        Customer customer1 = new Customer("cus1", "Nguyen A", "HN", "222222");
        Customer customer2 = new Customer("cus2", "Nguyen B", "DN", "333333");

        // tao Order
        Order order1 = new Order(1, LocalDate.now(), "cus1");
        Order order2 = new Order(2, LocalDate.now(), "cus2");

        // tao orderDetail
        OrderDetail orderDetail1 = new OrderDetail(1, 1, 1, 3, 20);
        OrderDetail orderDetail2 = new OrderDetail(1, 2, 2, 2, 30);
        OrderDetail orderDetail3 = new OrderDetail(2, 3, 1, 9, 40);

        // tao danh sach OrderDetail
        List<OrderDetail> orderDetails1 = new ArrayList<>();
        List<OrderDetail> orderDetails2 = new ArrayList<>();
        orderDetails1.add(orderDetail1);
        orderDetails1.add(orderDetail2);
        orderDetails2.add(orderDetail3);

        // tao danh sach order
        Map<Order, List<OrderDetail>> orderMap1 = new TreeMap<>();
        Map<Order, List<OrderDetail>> orderMap2 = new TreeMap<>();
        orderMap1.put(order1, orderDetails1);
        orderMap2.put(order2, orderDetails2);

        // tao danh sach khach hang
        tm.put(order1, orderDetails1);
        tm.put(order2, orderDetails2);
        hm.put(customer1, orderMap1);
        hm.put(customer2, orderMap2);
    }

}
