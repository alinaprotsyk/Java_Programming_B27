package HomeWork;

import java.util.Scanner;

public class IfStatement2 {
    public static void main(String[] args) {
      /*
      Create three number variables
Find and print which number is bigger between the three

	ex:
		50
		45
		100

		output:
		100 is the biggest
       */
        int num1 = 12;
        int num2 = 45;
        int num3 = 87;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the biggest");
        } else if(num2 > num1 && num2 >num3){
            System.out.println(num2 + " is the biggest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the biggest");
        }
        System.out.println("__________");



        // Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter three numbers below: ");
        int num4 = input.nextInt();
        int num5 = input.nextInt();;
        int num6 = input.nextInt();
         if(num4 > num5 && num4 > num6) {
             System.out.println(num4 +" is the biggest");
         } else if (num5 > num4 && num5 > num6) {
             System.out.println(num5 + " is the biggest");

         } else if (num6 > num4 && num6 > num5) {
             System.out.println(num6 + "is the biggest");
         }
    }
}
