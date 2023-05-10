package lab.Buoi_1.bai5;

public class bai5_3 {
    public static final int hashTableSize= 7;

    public static void insert(int value, Node[] nodes) {
        int index = hasFunc(value);
        Node newNode = new Node(value);
        Node currentNode = nodes[index];
        Node preNode = null;

        while (currentNode != null && currentNode.getValue() < value) {
            preNode = currentNode;
            currentNode = currentNode.getNode();
        }

        if (preNode == null) {
            nodes[index] = newNode;
            newNode.setNode(currentNode);
        } else if (currentNode == null) {
            preNode.setNode(newNode);
        } else {
            newNode.setNode(currentNode);
            preNode.setNode(newNode);
        }



    }

    public static int hasFunc(int value) {
        return value % hashTableSize;
    }

    public static int search(int value, Node[] nodes) {
        int index = hasFunc(value);
        Node nodeSearch = nodes[index];

        while (nodeSearch != null) {
            if (nodeSearch.getValue() == value) {
               return index;
            }
            nodeSearch = nodeSearch.getNode();
        }

        return  -1;
    }

    public static void delete(int value, Node[] nodes) {
        int index = search(value, nodes);

        if (index != -1) {
            Node node = nodes[index];
            Node pre = null;
            while (node != null && node.getValue() != value) {
                pre = node;
                node = node.getNode();
            }

            if (pre == null) {
                nodes[index] = node != null ? node.getNode() : null;
            } else {
                pre.setNode(node != null ? node.getNode() : null);
            }
        } else {
            System.out.println("Khong co phan tu muon xoa");
        }
    }
    public static void main(String[] args) {
        Node[] nodes = new Node[7];
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
