package lab.Buoi_2.bai2._2_2;


import lab.Buoi_2.ssl.SSL;

public class MyStackHasASSL {
    private SSL ssl;

    public MyStackHasASSL() {
        this.ssl = new SSL();
    }

    public MyStackHasASSL(SSL ssl) {
        this.ssl = ssl;
    }

    public void push(int x) {
        this.ssl.insertAtBack(x);
    }

    public Integer pop() {
        return this.ssl.deleteAtBack();
    }

    public void printAll () {
        ssl.printAll();
    }
    public static void main(String[] args) {
        MyStackHasASSL myStackHasASSL = new MyStackHasASSL();
        myStackHasASSL.push(2);
        myStackHasASSL.push(3);
        myStackHasASSL.push(4);
        myStackHasASSL.push(5);
        myStackHasASSL.pop();
        myStackHasASSL.printAll();
    }
}
