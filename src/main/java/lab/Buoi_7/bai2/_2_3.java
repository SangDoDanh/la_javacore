package lab.Buoi_7.bai2;

interface MessageAble {
    Message getMessage(String msg);

}
interface MessageAble2 {
    Message2 MESSAGE_2(String name, int id);

}


class Message {
    public Message(String mes) {
        System.out.println(mes);
    }

}
class Message2 {
    private String name;
    private int id;

    public Message2(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("ua alo");
    }
}
// tham chieu constructor
public class _2_3 {
    public static void main(String[] args) {
        MessageAble messageAble = Message :: new;
        messageAble.getMessage("Hello");


        MessageAble2 messageAble2 = Message2::new;
        messageAble2.MESSAGE_2("sang", 1);
    }
}
