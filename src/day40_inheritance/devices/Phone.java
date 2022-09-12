package day40_inheritance.devices;

public class Phone extends Device {
    /*
    Create a class called Phone:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using Phone
     */

    public Phone(String brand, int model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }
    //    useDevice(): Override to print Using Phone

    @Override
    public String useDevice(){
        return super.useDevice() + "Phone";
    }
    //- methods: toString(),
    public String toString(){
        return super.toString() ;
    }
}
