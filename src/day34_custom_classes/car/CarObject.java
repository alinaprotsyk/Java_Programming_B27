package day34_custom_classes.car;

import day34_custom_classes.car.Car;

public class CarObject {
    public static void main(String[] args) {
        Car car = new Car();
        car.model ="Honda";
        car.color = "white";
        car.year = 2018;
        car.fuel = 80;
        System.out.println("gas is low: " + car.isLow());
        System.out.println(car);
    }
}
