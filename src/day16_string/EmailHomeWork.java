package day16_string;

import java.util.Scanner;

public class EmailHomeWork {
    /*
    [Creating an email]

Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        Secret
    output:
        jameret@cydeo.com
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter two strings should be at least 6 character long");
        String name = input.nextLine();
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        String email = name.substring(0,4) + lastName.substring(lastName.length()-3);
        if(name.length() >= 6 && lastName.length() >= 6) {
            System.out.println("Your email is: " + email.toLowerCase() + "@cydeo.com");
        } else {
            System.out.println("Invalid data");

        }

    }


}
