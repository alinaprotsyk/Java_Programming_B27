package day15_string;

import java.util.Scanner;
/*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter three words");
        String words1 = input.next();
        String words2 = input.next();
        String  words3 = input.next();

        if (words1.length() > words2.length() && words1.length() > words3.length() && words1.contains("a")){
            System.out.println("The biggest word that contains \"a\" is: " + words1);

        } else if (words2.length() > words1.length() && words2.length() > words3.length() && words2.contains("a")) {
            System.out.println("The biggest word that contains \"a\" is:" + words2);

        } else if (words3.length() > words1.length() && words3.length() > words2.length() && words3.contains("a")) {
            System.out.println("The biggest word that contains \"a\" is: " + words3);
        } else {
            System.out.println("invalid word");
        }

    }
}
