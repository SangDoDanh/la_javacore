package lab.Buoi_2.ssl_kep;

public class SSL2 {
    Node head;
    SSL2() {
        this.head = null;
    }

    public void insertAtBack(int x) {
        Node newNode = new Node(x);
        if(isEmpty())
            head = newNode;
        else {
            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.pre = tmp;
        }

    }

    public Integer deleteFront() {
        if (isEmpty()) {
            return  null;
        } else {
            int result;
            result = head.data;
            head = head.next;
            if (head != null) {
                head.pre = null;
            }
            return  result;
        }
    }

    public Integer deleteBack() {
        if (isEmpty()) {
            return  null;
        } else {
            int result;
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            result = tmp.data;
            if (tmp.pre == null) {
                head = null;
            } else {
                Node pre = tmp.pre;
                pre.next = null;
            }
            return  result;
        }
    }


    public Integer delete(int x) {
        if(isEmpty())
            return null;
        else {
            int result;
            Node tmp = head;
            while (tmp != null && tmp.data != x) {
                tmp = tmp.next;
            }

            if(tmp == null) {
                return null;
            } else {
                Node pre = tmp.pre;
                result = tmp.data;
                if (pre == null) {
                    head = null;
                } else {
                    pre.next = tmp.next;
                    tmp.next.pre = pre;
                }
            }
            return  result;
        }
    }

    public void insertAtFront(int x) {
        if(isEmpty())
            head = new Node(x);
        else {
            Node newNode =  new Node(x, head, null);
            head.pre = newNode;
            head = newNode;
        }
    }
    public void printAll() {
        Node tmp = head;
        while (tmp != null) {
            if(tmp.next == null)
                System.out.println(tmp.data);
            else
                System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
    public boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        SSL2 ssl2 = new SSL2();
//        ssl2.insertAtBack(1);
//        ssl2.insertAtBack(2);
//        ssl2.insertAtBack(3);
//        ssl2.insertAtBack(4);
        ssl2.insertAtFront(1);
        ssl2.insertAtFront(2);
        ssl2.insertAtFront(3);
        ssl2.insertAtFront(4);
        ssl2.deleteFront();
        ssl2.deleteFront();
        ssl2.printAll();
    }
}
