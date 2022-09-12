package day40_inheritance.lyft1;

public class Lyft {
    /*
        Create a class Lyft for ride sharing

        declare a method calculateRate(miles)
        return the cost of the ride: miles * 1.5
     */

    String name;
    double miles;

    public Lyft(String name, double miles) {
        this.name = name;
        this.miles = miles;
    }

    public double calculateRate(double miles){
        return miles * 1.5;
    }

    public String toString(){
        return "Ride: " + name + "\nMiles: " + miles + "\nTotal Cost: " + calculateRate(miles);
    }

}
