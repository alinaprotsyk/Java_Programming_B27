package day16_string;

import java.util.Scanner;

public class FixedName {
    public static void main(String[] args) {
        /*
        ask user to enter last name and first name
        print both names in proper form
        uppercase first letter and lower case first letter

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first name");
        String firstName = input.next().toLowerCase();
        System.out.println("Please, enter your last name");
        String lastName = input.next().toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);




    }
}
