package day40_inheritance.devices;

public class TV extends Device {
    /*
    Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV
     */

  //constructor
  public TV(String brand, int model, double price, boolean isWireless){
    super(brand, model, price, isWireless);
  }

  //- methods: toString(),
  //    useDevice(): Override to print Using TV
  @Override
  public String useDevice(){

    return super.useDevice() + "TV";
  }
  public String toString(){

    return super.toString() ;
  }

}
