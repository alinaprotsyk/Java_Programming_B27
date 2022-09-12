package day37_static.car;

public class Car {
    String model; // string class, instance level, object type
    Driver driver; // driver class, instance level, object type

    public Car(String model, String name, long licenceNumber, char licenceType){
        this.model = model;
        driver = new Driver(name, licenceNumber, licenceType); // creating  a Driver object

    }
    public Car(String model, Driver driver){
        this.model = model;
        this.driver = driver;

    }
}
