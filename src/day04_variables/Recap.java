package day04_variables;

public class Recap {
    public static void main(String[] args) {
        // declare variables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkills;

        // assigning value to variables
        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftSkills = 2;
        System.out.println("temperature = " + temperature + " Celsius ");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkills = " + numberOfSoftSkills);


        // declare and assign at the same time
        int numberOfCoffeeCups = 2;
        float ratingOfMovie = 8.9F; // compiler takes 8.9 as double, we add f/F to the end to make it float type
        long waterInOcean = 200_000_000_000_000L; // compiler takes 200000000000000 as int type, but this number is too big for int, so it doesn't compile, we need to add l/L to make it a long type

        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean + "liters");


    }
}
