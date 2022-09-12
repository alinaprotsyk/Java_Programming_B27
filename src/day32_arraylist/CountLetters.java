package day32_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CountLetters {
    /*
    Count Letters

Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements

Ex:
Input:
	”java”, ”html”, “css”, “java”, “javascript”, “selenium”
	letter: ‘a’
Output:
	6
     */

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        ArrayList<Character> characters = new ArrayList<>();
        for (String each : words) {
            for (int i = 0; i < each.length(); i++) {
                Character letter = each.charAt(i);
                characters.add(letter);
            }
        }
        System.out.println(Collections.frequency(characters, 'a'));
    }
}
