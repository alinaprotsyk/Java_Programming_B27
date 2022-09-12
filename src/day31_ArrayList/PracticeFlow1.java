package day31_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PracticeFlow1 {
    public static void main(String[] args) {
        /*
        Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

         */
        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        words.add("Shoes");
        words.add(1, "Jacket");
        words.add(0, "Towel");
        words.add(1, "Car");
        System.out.println(words);
    }
}
