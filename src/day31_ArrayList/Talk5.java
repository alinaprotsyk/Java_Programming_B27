package day31_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Talk5 {
    public static void main(String[] args) {
        /*
        Try to loop:

Create an ArrayList of Double elements
Fill the ArrayList with some values
Find the max element from the ArrayList
         */

        ArrayList<Double> doubleElements = new ArrayList<>();
        doubleElements.add(12.2);
        doubleElements.add(134.7);
        doubleElements.add(2435.56);
        System.out.println(doubleElements);

        double max = doubleElements.get(0);

        for (Double each : doubleElements) {
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
