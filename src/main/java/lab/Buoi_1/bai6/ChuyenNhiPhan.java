package lab.Buoi_1.bai6;

public class ChuyenNhiPhan {

    public static void main(String[] args) {
        int thapPhan = 994499;
        MyStack binaryStack = new MyStack();
        while (thapPhan > 0) {
            binaryStack.push(thapPhan % 2);
            thapPhan /= 2;
        }

        System.out.print("Số nhị phân : ");
        while (!binaryStack.isEmpty()) {
            System.out.print(binaryStack.pop());
        }
    }
}
