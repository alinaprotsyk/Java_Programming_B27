package day40_inheritance.devices;

public class Device {
    /*
    Create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()
     */

    //- attributes: brand, model, price, wireless

    String brand;
    int model;
    double price;
    boolean isWireless;

    //constructor
    public Device(String brand, int model, double price, boolean isWireless){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }
    //- methods: toString(), useDevice()
    public String useDevice(){
        return "Using "  ;
    }
    public String toString(){

        return "Brand: " + brand + ", Model: " + model + ", Price: " +price + ", Wireless: " +isWireless + "\n"+useDevice();
    }
}
