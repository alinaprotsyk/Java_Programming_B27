package HomeWork;

import java.util.Scanner;

public class HomeWorkScanner3 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
         */
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter three numbers");
double num1 = numbers.nextDouble();
       double num2 = numbers.nextDouble();
       double num3 = numbers.nextDouble();
      double sum = num1 + num2 + num3;
        boolean isTriangle = sum == 180;

        boolean isAngles =  sum == 360;
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isAngles = " + isAngles);




    }
}
