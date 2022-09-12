package HomeWork;

import java.util.Scanner;

public class WorkScanner2 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an item price");
        double price = input.nextDouble();
        System.out.println("Enter quantity");
       int quantity = input.nextInt();
       double revenue = price * quantity;
        System.out.println("Revenue: $" + revenue);
    }
}
