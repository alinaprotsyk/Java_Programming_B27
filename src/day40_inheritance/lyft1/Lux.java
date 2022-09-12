package day40_inheritance.lyft1;

public class Lux extends Lyft{
    /*
        Create a class Lux

        child class of Lyft

        declare a method calculateRate(miles)
        return the cost of the ride: base rate of Lyft ride + 20%
     */

    public Lux(String name, double miles) {
        super(name, miles);
    }

    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) + (miles * 1.5 * 0.20);
    }

}
