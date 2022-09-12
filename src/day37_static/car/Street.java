package day37_static.car;

public class Street {
    public static void main(String[] args) {
        Car bmw = new Car("X5", "Alina", 321243445, 'C');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name); // this is accessing instance variable
    }
}
