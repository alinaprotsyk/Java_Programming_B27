package day10_if_statement;

public class TernaryExample {
    public static void main(String[] args) {
        int score = 50;
        if(score > 70) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }


        System.out.println("-------------");

        int score2 = 50;
        String result;
        if(score2 > 70) {
            result = "Passing";
        } else {
            result = "Failing";

        }
        System.out.println(result);


        System.out.println("_______");



        int score3 = 80;
       String result2 = score3 > 70 ? "Passing" : "Failing";
        System.out.println(result2); // storing the result to a String variable
        System.out.println(score3 > 70 ? "Passing" : "Failing"); // printing the result right away


        System.out.println("_______");
        int n = 9;
        System.out.println(n % 2 == 0 ? "even" : "odd");


        System.out.println("_______");
        boolean isGreen = false;
        System.out.println(isGreen ? "drive" : "stop");
        /*
        is(isGreen) {
         System.out.println("Drive");
         } else {
          System.out.println("Stop");
          {

         */

        System.out.println("_______");

        int num= 10;
        System.out.println(num > 0 ? "Positive" : n < 0 ? "Negative" : "Zero");


    }
}
