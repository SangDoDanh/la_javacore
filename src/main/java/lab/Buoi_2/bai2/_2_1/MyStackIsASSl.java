package lab.Buoi_2.bai2._2_1;


import lab.Buoi_2.ssl.SSL;

public class MyStackIsASSl extends SSL {
   public void push(int x) {
       insertAtBack(x);
   }
   public Integer pop() {
       return deleteAtBack();
   }

    public static void main(String[] args) {
        MyStackIsASSl ssl = new MyStackIsASSl();
       ssl.push(1);
       ssl.push(2);
       ssl.push(3);
       ssl.push(4);
       ssl.push(4);
       ssl.push(4);
       ssl.pop();
       ssl.pop();
       ssl.pop();
       ssl.printAll();
    }
}
