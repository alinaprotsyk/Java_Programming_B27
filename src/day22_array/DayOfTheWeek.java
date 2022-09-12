package day22_array;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the day number");
    int number = input.nextInt();
        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[number -1]);
    }
}
