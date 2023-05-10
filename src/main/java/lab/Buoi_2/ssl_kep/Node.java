package lab.Buoi_2.ssl_kep;

public class Node {
    int data;
    Node next;
    Node pre;

    public Node(int data, Node next, Node pre) {
        this.data = data;
        this.next = next;
        this.pre = pre;
    }

    public Node(int data) {
        this(data, null, null);
    }
}
