package lab.Buoi_1.bai5;

public class bai5_1 {
    public static final int hashTableSize= 7;

    public static void insert(int value, Node[] nodes) {
        int index = hasFunc(value);

        if (nodes[index] == null) {
            nodes[index] = new Node(value);
        }
    }

    public static int hasFunc(int value) {
        return value % hashTableSize;
    }
    public static void main(String[] args) {
        Node[] nodes = new Node[7];
        insert(28, nodes);
        insert(7, nodes);
        insert(14, nodes);
        insert(28, nodes);
        insert(17, nodes);
        insert(5, nodes);
        insert(23, nodes);

        for(Node node : nodes) {
            while (node != null) {
                System.out.print(node.getValue() + "  ");
                node = node.getNode();
            }
            System.out.println();
        }
    }
}
