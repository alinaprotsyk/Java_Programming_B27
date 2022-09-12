package day06_operators;

public class RelationalExamples {
    public static void main(String[] args) {
        System.out.println(3 >= 2);
        System.out.println(5 > 10);

        int a = 10;
        int b = 20;
        System.out.println(a < b); // 10 less than 20
        System.out.println(a < 15); // 10 < 15 -> true

        System.out.println(10 == 10);
        boolean isEqual = 11 == 5;
        System.out.println(isEqual);

        System.out.println(4 != 20);
        System.out.println(20 != 20);
        System.out.println(true == true);
        System.out.println('a' == 'A');

        /*
        define a number
        find out if it is even

         */
         int num = 5;
         boolean isEven = num % 2 == 0;
     boolean isOdd = num % 2 != 0; // num % 2 == 1 // isEven != true
        System.out.println("isEven = " + isEven);
        System.out.println("IsOdd = " + isOdd);





    }
}
