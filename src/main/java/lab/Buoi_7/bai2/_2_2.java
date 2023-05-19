package lab.Buoi_7.bai2;
interface SayAble2_2 {
    void say();
}

// Tham chiếu phương thức instance
public class _2_2 {
    public void something() {
        System.out.println("helo, day la method instance...");
    }

    public static void main(String[] args) {
        // cach 1
        SayAble2_2 sayAble2_2 = new _2_2() ::something;
        sayAble2_2.say();

        // cach 2
        _2_2 instance = new _2_2();
        SayAble2_2 sayAble2_21 = instance::something;
        sayAble2_21.say();
    }
}
