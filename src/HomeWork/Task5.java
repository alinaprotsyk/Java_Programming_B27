package HomeWork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52)
         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter a salary");
        double salary = input.nextDouble();
        System.out.println("Enter number of hours");
        int hours = input.nextInt();
        double hourlyRate = salary / (hours * 52);
        System.out.println("hourlyRate = " + hourlyRate);
    }
}
