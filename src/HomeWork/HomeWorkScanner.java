package HomeWork;

import java.util.Scanner;

public class HomeWorkScanner {
    public static void main(String[] args) {
        /*
        For all the tasks you will need to create a main method and Scanner object
___________________________________________________________________________

Create a program that will ask the user to enter two numbers. Add the numbers and print the result
         */
        Scanner input = new Scanner(System.in); // Scanner object
        System.out.println("Please enter a number1");
        int number1 = input.nextInt();
        System.out.println("Please enter number2");
        int number2 = input.nextInt();
        int result = number1 + number2;

        System.out.println("Some of two numbers: " + result);


    }
}
