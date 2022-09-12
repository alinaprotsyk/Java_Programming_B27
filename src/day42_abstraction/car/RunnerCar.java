package day42_abstraction.car;

public class RunnerCar {
    public static void main(String[] args) {
        BMW obj1 = new BMW();
        obj1.start();
        Toyota obj2 = new Toyota();
        obj2.start();
        Tesla obj3 = new Tesla();
        obj3.start();
        obj3.charge();
    }
}
