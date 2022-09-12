package day37_static.computer;

public class Computer {
    /*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references
     */


    double price;
    String brand;
    String color;

    static  boolean hasScreen;
    static  boolean hasBattery;
    static  boolean hasMemory;


    static {
        hasScreen = true;
        hasBattery = true;
        hasMemory  = true;




    }

    public Computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    public static void info(){
        System.out.println("Has battery: " + hasBattery);
        System.out.println("Has screen: " + hasScreen);
        System.out.println("Has memory: " + hasMemory);
    }


    public String returtoString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
