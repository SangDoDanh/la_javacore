package lab.Buoi_2.bai3;


import lab.Buoi_2.ssl.SSL;

public class _3_2 {
    private SSL ssl;

    public _3_2() {
        this.ssl = new SSL();
    }

    public _3_2(SSL ssl) {
        this.ssl = ssl;
    }

    public SSL getSsl() {
        return ssl;
    }

    public void setSsl(SSL ssl) {
        this.ssl = ssl;
    }

    // thêm vào đầu
    public void add (int x) {
        this.ssl.insertAtFront(x);
    }

    // lấy ra và gỡ bỏ ở cuối
    public Integer poll () {
        return  this.ssl.deleteAtBack();
    }

    public static void main(String[] args) {
        _3_2 demoQueue = new _3_2();
        demoQueue.add(1);
        demoQueue.add(6);
        demoQueue.add(5);
        demoQueue.add(3);

        // Lấy các phần tử ra
        while (!demoQueue.getSsl().isEmpty()) {
            System.out.print(demoQueue.poll() + " ");
        }


    }
}
