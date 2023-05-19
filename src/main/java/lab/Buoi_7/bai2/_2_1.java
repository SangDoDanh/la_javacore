package lab.Buoi_7.bai2;
interface SayAble {
    void say();
}

// 2.1. Tham chiếu phương thức tĩnh
public class _2_1 {
    public static void something() {
        System.out.println("xin chao, day la mot static method...");
    }
    public static void main(String[] args) {
        SayAble sayAble = _2_1::something;

        sayAble.say();
    }
}
