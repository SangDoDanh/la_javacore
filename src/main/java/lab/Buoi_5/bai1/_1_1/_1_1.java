package lab.Buoi_5.bai1._1_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _1_1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();// new ArrayList<String>();//
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("Cach 1:");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print (itr.next()+"; ");
        }
        System.out.println("\nCach 2:");
        for (String st:list) {
            System.out.print (st+"; ");
        }
    }
}
