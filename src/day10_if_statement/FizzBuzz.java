package day10_if_statement;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        [IQ] Given a number n print the output on the following conditions:
        the number is divisible by 3 print Fizz
        the number if divisible by 5 print Buzz
        the number is divisible by 3 and 5 print FizzBuzz
        the number is not divisible by any print just the number
        Ex:
            n = 10
            Buzz

            n = 12
            Fizz

            n = 13
            13

            n = 15
            FizzBuzz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();

       // int number = 15; harcoded version


        if (number % 3 ==0 || number % 5==0) {
            System.out.println("FizzBuzz");
        } else if(number % 3 == 0){
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

/*
boolean by3 = number % 3 == 0;
boolean by5 = number % 5 == 0;
if (by 3 && by 5) {
            System.out.println("FizzBuzz");
        } else if(by3){
            System.out.println("Fizz");
        } else if (by5) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
 */

    }
}

