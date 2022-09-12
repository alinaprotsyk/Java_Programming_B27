package day12_switch;

import java.util.Scanner;

public class DaysInTheMOnths {
    public static void main(String[] args) {
        /*
        Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter month ");
        String monthName = input.next();

        switch (monthName){
            case "February" :
                System.out.println(monthName + " has 28 days");
                break;
            case "April" :
            case "June":
            case "September" :
            case "November" :
                System.out.println(monthName + " has 30 days");
                break;
            case "January" :
            case "March":
            case "May" :
            case "July" :
            case "August" :
            case "October" :
            case "December":
                System.out.println(monthName + " has 31 days");
                break;
            default:
                System.out.println("Invalid character");




        }




    }
}
