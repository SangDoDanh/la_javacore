package lab.Buoi_2.ssl;

public class Node {
    int data;
    Node next;
    public Node(int x) {
        this(x, null);
    }

    public Node(int x, Node nextNode) {
        data = x;
        next = nextNode;
    }

}
