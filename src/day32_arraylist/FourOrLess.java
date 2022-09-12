package day32_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings, go through and find Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList. Print that ArrayList of words

Ex:
	Input:
		“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
	Output:
		 [ tree, loop, cat ]
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        String s = "";
        for (String each : list) {
            if (each.length() <= 4){
               s += each + " ";
                String[] strs = s.split(" ");
                ArrayList<String> newList = new ArrayList<>(Arrays.asList(strs));
                System.out.println(newList);
            }
        }
    }
}
