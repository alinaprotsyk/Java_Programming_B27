package day34_custom_classes.car;

public class Car {
    /*
    Create a class Car

create instance variables:
    model, year, color, fuel level (percent number)

create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created

     */
    String model;
    int year;
    String color;
    double fuel;


    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuel=" + fuel +
                '}';
    }

    public void drive(){
        System.out.println("Driving " + model);
        fuel -= 5;

    }
    public void fillTank(){
        System.out.println("tank needs refill : " + (100 - fuel) + "%");
    }

    public  boolean isLow(){
        if (fuel <25){
            fillTank();
            return true;
        }
        return false;
    }
}
