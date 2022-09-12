package day31_ArrayList;

import java.util.ArrayList;

public class ArraylistWithLoop {
    public static void main(String[] args) {
        /*
        Try to loop:

Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList

         */

        ArrayList<Character> letters = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            letters.add(i);
        }
        System.out.println(letters);


        letters.remove((Character) 'a');
        letters.remove((Character)'e');
        letters.remove((Character)'i');
        letters.remove((Character)'o');
        letters.remove((Character)'u');
        System.out.println(letters);



    }
}
