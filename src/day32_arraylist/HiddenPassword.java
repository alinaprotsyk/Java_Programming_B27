package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HiddenPassword {
    public static void main(String[] args) {

        // my version of task
        /*
        Hide passwords

Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]
         */

        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> hiddenPassword  = new ArrayList<>();
        for (String each : password){
            String stars = "";
            for (int i = 0; i < each.length(); i++) {
                stars += "*";
            }
            hiddenPassword.add(stars);
        }
        System.out.println(hiddenPassword);
    }
}
