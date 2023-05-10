package lab.Buoi_2.bai3;


import lab.Buoi_2.ssl.SSL;

public class _3_1 extends SSL {
    // Xây dựng lớp hàng đợi kế thừa từ lớp SLL (is-a)

    public void add (int x) {
        insertAtFront(x);
    }

    public Integer poll() {
        return deleteAtBack();
    }

    public static void main(String[] args) {
        _3_1 demoQueue = new _3_1();
        demoQueue.add(1);
        demoQueue.add(6);
        demoQueue.add(5);
        demoQueue.add(3);

        // Lấy các phần tử ra
        while (!demoQueue.isEmpty()) {
            System.out.print(demoQueue.poll() + " ");
        }
    }
}
