package day20_loop;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*
        Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
         */
       String str = "This has multiple words";
       int count = 1;

        for (int i = 0; i < str.length(); i++) {
            char space = str.charAt(i);
            if (space == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
