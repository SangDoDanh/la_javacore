package lab.Buoi_7.bai1;
@FunctionalInterface
interface SayAble1_6 {
    String say(String name);
}
public class _1_6 {
    public static void main(String[] args) {
        SayAble1_6 sayAble1_6 = name -> {
            String s1 = "Xin chao";
            String s2 = s1 + name;
            return s2;
        };
        System.out.println(sayAble1_6.say("sang"));
    }
}
