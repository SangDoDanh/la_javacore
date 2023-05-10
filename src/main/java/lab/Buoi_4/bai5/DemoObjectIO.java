package lab.Buoi_4.bai5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoObjectIO {
    public static void main(String[] args) {
        Bike bike1 = new Bike("xs", 1, "234342");
        Bike bike2 = new Bike("xX", 3, "895984");
        Bike bike3 = new Bike("xV", 2, "555555");

        List<Bike> bikes = new ArrayList<>();
        bikes.add(bike1);
        bikes.add(bike2);
        bikes.add(bike3);
        String path = "data/objOutput.txt";
        ObjectOutput objectOutput = null;
        ObjectInput objectInput = null;
        try {
            // ghi
            objectOutput = new ObjectOutputStream(new FileOutputStream(path));
            objectInput = new ObjectInputStream(new FileInputStream(path));
            objectOutput.writeObject(bikes);

            // doc
            List<Bike> result = (ArrayList<Bike>) objectInput.readObject();
            for (Bike bike : result) {
                System.out.println(bike);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectOutput != null) {
                try {
                    objectOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
