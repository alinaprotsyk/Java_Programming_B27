package day14_string;

import java.util.Scanner;

public class StringPassword {
    public static void main(String[] args) {
        /*
        Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your  full name");
        String name = input.nextLine();
        String fullName = name.trim();
        System.out.println(fullName);
        String nameToLowerCase = name.toLowerCase();
        System.out.println(nameToLowerCase);
        int  numbers = nameToLowerCase.length();
        System.out.println(numbers);

    }
}
