package lab.Buoi_7.bai1;

interface SayAble {
    public String say(String name);
}
public class _1_2 {
    public static void main(String[] args) {
        SayAble sayAble;

        // cach 1
            sayAble = (name) -> {
                return  "hello" + name;
            };
        System.out.println(sayAble.say("sang"));
        // cach 2 ko co () vi chi co 1 tham so
            sayAble = name -> "hello" + name;
        System.out.println(sayAble.say("sang"));

    }
}
