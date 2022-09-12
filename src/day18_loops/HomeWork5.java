package day18_loops;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
         */
        Scanner input = new Scanner(System.in);
        int num = 0;
        int sumOfNumbers = 0;

        do {
            System.out.println("Enter a number");
            num = input.nextInt();
           if (num >0){
               sumOfNumbers += num;
           }

        } while (num >= 0);
        System.out.println("sumOfNumbers = " + sumOfNumbers);
    }
}
