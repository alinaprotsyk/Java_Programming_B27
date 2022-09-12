package day13_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        vending machine
        snacks
        1
        2
        3

        drinks
        4
        5
        6
         */
        System.out.println("Welcome to vending machine. Select the menu you want to see:\n\tSnacks\n\tDrinks");
       String menu = input.next();
       switch (menu){
           case "Snacks":
               System.out.println("Pick the snack:\n1)Chips 2)Cookies 3)Pretzels 4)Candy");
               int snackOption = input.nextInt();
               if(snackOption == 1){
                   System.out.println("Chips are selected");
               } else if (snackOption == 2) {
                   System.out.println("Cookies are mine favourite");
               } else if (snackOption ==3) {
                   System.out.println("Pretzels dispensing");
               } else if(snackOption ==4) {
                   System.out.println("Candy");
               } else {
                   System.out.println("Invalid option");
               }
               break;

           case "Drinks":
               System.out.println("Pick up drink number:\n1)Juice 2)Soda");
               int dribkOption = input.nextInt();
               if (dribkOption == 1){
                   System.out.println("Giving juice");
               } else if (dribkOption == 2) {
                   System.out.println("Soda selected");

               }else {
                   System.out.println("Invalid item");
               }
       }

    }
}
