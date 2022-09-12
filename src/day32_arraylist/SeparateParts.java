package day32_arraylist;

import java.util.ArrayList;

public class SeparateParts {
    /*
    Separate Parts

Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if (Character.isLetter(chars)){
                letters.add(str.charAt(i));
            } else if (Character.isDigit(chars)){
                numbers.add(str.charAt(i));
            } else {
                specialChar.add(str.charAt(i));
            }
        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(specialChar);
    }
}
