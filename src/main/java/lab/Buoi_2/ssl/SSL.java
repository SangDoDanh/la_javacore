package lab.Buoi_2.ssl;

public class SSL {
    protected Node head;

    public SSL() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBack(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    public Integer deleteAtBack() {
        int result;
        if(isEmpty())
            return null;

        Node tmp = head;
        Node pri = null;

        while (tmp.next != null) {
            pri = tmp;
            tmp = tmp.next;
        }

        result = tmp.data;

        if( pri == null) {
            head = null;
        } else {
            pri.next = null;
        }

        return  result;
    }


    public Integer deleteAtFront() {
        if(head == null)
            return null;
        else {
            int result = head.data;
            head = head.next;
            return  result;
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

    public void delete(int y) {
        if(isEmpty())
            return;
        Node tmp = head;
        Node pri = null;

        while (tmp != null && tmp.data != y) {
            pri = tmp;
            tmp = tmp.next;

        }

        if(tmp == null) {
            return;
        } else {
            if (pri == null) {
                head = head.next;
            } else {
                pri.next = tmp.next;
            }
        }
    }

    public void insertAtFront(int x) {
        head = new Node(x, head);
    }

}
