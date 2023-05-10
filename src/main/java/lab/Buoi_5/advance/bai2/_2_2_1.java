package lab.Buoi_5.advance.bai2;

import java.time.LocalDate;
import java.util.*;

public class _2_2_1 {
    public static Map<Customer, Map<Order, List<OrderDetail>>> customerMapMap;

    static {
        customerMapMap = new TreeMap<>();
        // tao khach hang
        Customer customer1 = new Customer("cus1", "Nguyen A", "HN", "222222");
        Customer customer2 = new Customer("cus2", "Nguyen B", "DN", "333333");

        // tao Order
        Order order1 = new Order(1, LocalDate.now(), "cus1");
        Order order2 = new Order(2, LocalDate.now(), "cus2");

        // tao orderDetail
        OrderDetail orderDetail1 = new OrderDetail(1, 1, 1, 3, 20);
        OrderDetail orderDetail2 = new OrderDetail(1, 2, 2, 2, 30);
        OrderDetail orderDetail3 = new OrderDetail(2, 3, 1, 3, 40);

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
        customerMapMap.put(customer1, orderMap1);
        customerMapMap.put(customer2, orderMap2);
    }

    public static void main(String[] args) {
        // Thực hành tìm kiếm danh sách hoá đơn theo mã khách hàng
        searOrderByOrderId("cus1");
        searOrderByOrderId("cus2");
        // In ra các khách hàng có tổng giá trị hóa đơn cao nhất
        bestCustomersByTotal();
        // In ra các khách hàng có số lượng hóa đơn nhiều nhất
        bestCustomersByOrder();
    }


    // In ra các khách hàng có tổng giá trị hóa đơn cao nhất
    public static void bestCustomersByTotal() {
        Map<Customer, Double> totalMap = totalOrderByCustomer();
        if (totalMap.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            double max = totalMap.get(null);
            totalMap.remove(null);
            System.out.println(" Các khách hàng có tổng giá trị hóa đơn cao nhất");
            for (Map.Entry<Customer, Double> entry : totalMap.entrySet()) {
                if (entry.getValue() == max)
                    System.out.println(entry.getKey().getName() + " : " + max);
            }
        }

    }

    // In ra các khách hàng có số lượng hóa đơn nhiều nhất

    public static void bestCustomersByOrder() {
        Map<Customer, Integer> countMap = countOrderByCustomer();

        if (countMap.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            int max = countMap.get(null);
            countMap.remove(null);
            System.out.println(" Các khách hàng có tổng giá trị hóa đơn cao nhất");
            for (Map.Entry<Customer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == max)
                    System.out.println(entry.getKey().getName() + " : " + max);
            }
        }

    }

    public static Map<Customer, Double> totalOrderByCustomer() {

        Map<Customer, Double> totalMap = new HashMap<>();
        double max = 0;
        double total = 0;

        for (Customer c  : customerMapMap.keySet()) { // customer
            for (Order o : customerMapMap.get(c).keySet()) { // order
                for (OrderDetail od : customerMapMap.get(c).get(o)) { // orderDetail
                    total += (od.getAmount() * od.getPrice());
                }
            }
            max = Math.max(max, total);
            if (total > max)
                totalMap.put(c, total);
            total = 0;
        }
        totalMap.put(null, max);
        return totalMap;
    }

    public static Map<Customer, Integer> countOrderByCustomer() {
        Map<Customer, Integer> coutMap = new HashMap<>();
        int max = 0;
        int count;
        for (Map.Entry<Customer, Map<Order, List<OrderDetail>>> entryCus : customerMapMap.entrySet()) {
            count = entryCus.getValue().size();
            max = Math.max(max, count);
            if (count == max && max > 0)
                coutMap.put(entryCus.getKey(), count);
        }
        coutMap.put(null, max);
        return coutMap;
    }

    // Thực hành tìm kiếm danh sách hoá đơn theo mã khách hàng
    public static void searOrderByOrderId(String cusId) {

        if (customerMapMap.isEmpty())
            System.out.println("Danh sach trong");
        else {
            Customer customer = new Customer("cus1", "Nguyen A", "HN", "222222");
            Order orders = new Order(1, LocalDate.now(), "cus1");
            List<OrderDetail> orderDetails = customerMapMap.get(customer).get(orders);

            if (orderDetails.isEmpty()) {
                System.out.println("Danh sach trong");
            } else {
                for (OrderDetail od : orderDetails) {
                    System.out.println(od);
                }
            }
        }
    }


}
