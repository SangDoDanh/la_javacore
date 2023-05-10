package lab.Buoi_2.bai4;



public class BTS {
    NodeTree root;
    static NodeTree rootNodeTree = null;

    public BTS() {
        this.root = null;
    }

    public BTS(int x) {
        this.root = new NodeTree(x);
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     *  - Tìm và trả về nodeTree tương ứng với giá trị x
     *  - gán lại giá trị nodeTree cha của nodeTree tìm được cho @rootNodeTree
     * @param x giá trị cần tìm
     * @param nodeTree nodeTree bắt đầu tìm
     * @return nodeTree tìm được hoặc null nếu không tìm thấy
     */
    public NodeTree find(int x, NodeTree nodeTree) {
        if(nodeTree == null)
            return null;

        if(nodeTree.data > x) {
            if (nodeTree.left != null)
                rootNodeTree = nodeTree;
            return nodeTree.left == null ? nodeTree : find(x, nodeTree.left);
        } else if (nodeTree.data < x) {
            if (nodeTree.right != null)
                rootNodeTree = nodeTree;
            return nodeTree.right == null ? nodeTree : find(x, nodeTree.right);
        }

        return nodeTree;
    }

    public void insert(int x) {
        if (isEmpty()) {
           this.root = new NodeTree(x);
        } else {
            NodeTree nodeTree = find(x, root);

            if (nodeTree.data > x) {
                nodeTree.left = new NodeTree(x);
            } else if (nodeTree.data < x){
                nodeTree.right = new NodeTree(x);
            }
        }
    }

    public  void delete(int x) {
        root = deleteRecursive(root, x);
    }


    // Xoa de quy
    public  NodeTree deleteRecursive(NodeTree root, int x) {
        if (root == null) // cay trong
            return root;

        if (root.data > x) {
            root.left = deleteRecursive(root.left, x);// một phiên bản mới của cây nhị phân
        } else if (root.data < x) {
            root.right = deleteRecursive(root.right, x);// một phiên bản mới của cây nhị phân
        } else { // tim thay node muon xoa
            if(root.left == null) { // khong co nhanh ben trai
                return root.right;
            } else if (root.right == null) { // khong co nhanh ben trai
                return root.left;
            } else { // có cả hai nhánh
                // trái cùng cay con phải
                nextLeftOfTreeRight(root, root.right); // thay vì đổi tham chiếu ta đổi giá trị
                root.right = deleteRecursive(root.right, root.data); // bản chất đoạn này là đổi node root
            }
        }

        return root; // một phiên bản mới của cây nhị phân
    }

    private void nextLeftOfTreeRight(NodeTree root, NodeTree nodeNext) {
        if(root.left == null) {
            root.data = nodeNext.data;
        }
        nextLeftOfTreeRight(root, nodeNext.left);
    }


    public void printAll(NodeTree nodeTree) {
        if(nodeTree == null)
            return;
        printAll(nodeTree.left);
        System.out.println(nodeTree.data);
        printAll(nodeTree.right);
    }

    public static void main(String[] args) {
        BTS bts = new BTS(6);
        bts.insert(4);
        bts.insert(23);
        bts.insert(5);
        bts.insert(8);
        bts.insert(66);
        bts.delete(8);
        bts.printAll(bts.root);
    }
}
