package lab.Buoi_1.bai6;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(5);
        myStack.push(5);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        System.out.println(myStack);
        System.out.println(myStack.size());
        while (!myStack.isEmpty())
            myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.size());


    }
}
