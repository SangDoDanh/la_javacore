package lab.Buoi_1.bai5;

public class Node {
    private Integer value;
    private Node node;

    public Node() {
        node = null;
    }

    public Node(Integer value, Node node) {
        this.value = value;
        this.node = node;
    }

    public Node(Integer value) {
        this(value, null);

    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public boolean hasNext() {
        return this.node != null;
    }
}
