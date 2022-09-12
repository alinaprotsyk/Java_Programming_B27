package day06_operators;

public class RelationalTasks {
    public static void main(String[] args) {
        /* declare a speed variable
        speed limit is 50
        find out if you are speeding
         */
        int currentSpeed = 60;
        int speedLimit = 50;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Is speeding:" + isSpeeding);


        /*
        declare a number variable
        find out if the number is positive, negative or zero
         */
        int number = -4;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        System.out.println("isPositive " + isPositive);
        System.out.println("isNegative " + isNegative);
        System.out.println("isZero " + isZero);

    }
}
