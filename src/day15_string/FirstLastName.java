package day15_string;

import java.util.Scanner;

public class FirstLastName {
    public static void main(String[] args) {
        /*
        create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName = scan.next();
        System.out.println("please enter your last name");

        String lastName = scan.next();
String initials = " " + firstName.charAt(0) + lastName.charAt(0);
        System.out.println("first name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println(initials.toUpperCase());

        firstName = firstName.trim();
        lastName = lastName.trim();
        System.out.print(firstName.toUpperCase().charAt(0));
        System.out.print(lastName.toUpperCase().charAt(0));

    }
}
