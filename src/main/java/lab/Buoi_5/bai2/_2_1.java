package lab.Buoi_5.bai2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _2_1 {
    public static void main(String args[]) {
        Set<String> set = new TreeSet<String>();//new HashSet<String>()
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        //Traversing elements
        System.out.println("Cách 1:");
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.print (itr.next()+"; ");
        }

        System.out.println("\nCách 2:");

        for (String st:set) {
            System.out.print (st+": ");
        }
    }
}
