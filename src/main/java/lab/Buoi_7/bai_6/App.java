package lab.Buoi_7.bai_6;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class App {
    private static List<Transaction> transactions;
    public static void main(String[] args) {
        init();

//        6.2.1. Tìm tất cả các giao dịch thực hiện trong năm 2023 và sắp xếp chúng theo số
//        lượng tăng dần.
        List<Transaction> transactions2023 = transactions.stream().filter(t -> t.getYear() == 2023)
                .sorted(Comparator.comparingInt(Transaction::getAmount))
                .collect(Collectors.toList());
        System.out.println(transactions2023);
        //6.2.2. In ra danh sách các địa chỉ của Customer (trùng thì loại)
        List<String> addressCustomerList = transactions.stream()
                .map(t -> t.getCustomer().getCity()).distinct().toList();
        System.out.println(addressCustomerList);

        //6.2.3. Xác định tất cả các khách hàng chung một địa chỉ nào đó, sort by name của
        //khách hàng và in ra.
        String addrFilter = "Ha Noi";
        List<Customer> addressFilterCustomerList = transactions.stream()
                .filter(t -> 0 == t.getCustomer().getName().compareToIgnoreCase(addrFilter))
                .map(t -> t.getCustomer()).toList();
        System.out.println(addressFilterCustomerList);

//        6.2.4. Sắp xếp tất cả khách hành theo tên và in ra.
        Collator collator = Collator.getInstance(new Locale("vi", "VN"));
        collator.setStrength(Collator.TERTIARY);
        List<Customer> customerListSortByName = transactions.stream()
                .sorted((t1, t2) -> collator.compare( t1.getCustomer().getName(),(t2.getCustomer().getName()))).
                map(Transaction::getCustomer).
                distinct().toList();
        System.out.println(customerListSortByName);

        // 6.2. 5. Kiểm tra xem có khách hàng ở địa chỉ nào đó hay không (y/n)?
        String addrCheck = "Ha Noi";
        System.out.println(checkAddress(addrCheck));

        //6.2.6. Xác định số lượng (amount) lớn nhất xuất hiện trong các giao dịch và in ra
        Transaction transaction = transactions.stream()
                .max(Comparator.comparing(Transaction::getAmount)).get();
        System.out.println("Amount of transaction: " + transaction);

//        6.2.7. Tính và in ra tổng số lượng trong các giao dịch của các khách hàng ở một địa
//        chỉ nào đó

        String addrFilter1 = "Ha Noi";
        int totalSum = transactions.stream()
                .filter(t -> t.getCustomer().getCity().equalsIgnoreCase(addrFilter1))
                        .map(t -> t.getAmount())
                                .reduce((a1, a2) -> a1 + a2).get();
        System.out.println(addressFilterCustomerList);

//        6.2.8. Xác định và in ra giao dịch có số lượng nhỏ nhất

        Transaction transactionMin = transactions.stream()
                .min(Comparator.comparing(Transaction::getAmount)).get();
        System.out.println("Amount of transaction: " + transaction);
        System.out.println("tran min: " + transactionMin);

    }

    public static boolean checkAddress(String addr) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getCustomer().getName().equalsIgnoreCase(addr));
    }

    static void init() {

        Customer customer1 = new Customer("Nguyen A", "Ha Noi");
        Customer customer2 = new Customer("Nguyen C", "HCM");
        Customer customer3 = new Customer("Nguyen B", "Da Nang");

        Transaction transaction1 = new Transaction(customer1, 2021, "iphone 13", 10);
        Transaction transaction2 = new Transaction(customer1, 2021, "iphone 14", 9);
        Transaction transaction3 = new Transaction(customer2, 2022, "iphone 10", 12);
        Transaction transaction4 = new Transaction(customer2, 2023, "iphone 11", 4);
        Transaction transaction5 = new Transaction(customer3, 2022, "iphone 12", 1);
        Transaction transaction6 = new Transaction(customer3, 2023, "iphone 14", 13);

        transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        transactions.add(transaction4);
        transactions.add(transaction5);
        transactions.add(transaction6);

    }
}
