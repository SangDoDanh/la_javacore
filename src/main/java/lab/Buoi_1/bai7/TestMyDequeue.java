package lab.Buoi_1.bai7;

public class TestMyDequeue {
    public static void main(String[] args) {
        MyDeQue myDeQueue = new MyDeQue();

        myDeQueue.add(1);
        myDeQueue.add(2);
        myDeQueue.add(3);
        myDeQueue.add(4);
        myDeQueue.add(5);
        myDeQueue.add(7);

        System.out.println(myDeQueue);
        myDeQueue.insert(6, 1);
        System.out.println(myDeQueue);
    }
}
