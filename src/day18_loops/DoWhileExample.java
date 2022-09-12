package day18_loops;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String last = input.nextLine();
        int number = input.nextInt();

        String fullName = "";

        if (number % 2 == 0){
            fullName = first + " " + last;

        } else {
            fullName = " not";

        }
        System.out.println("not valid");
    }
}
