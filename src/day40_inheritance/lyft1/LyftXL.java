package day40_inheritance.lyft1;

public class LyftXL extends Lyft{
    /*
        Create a class LyftXL

        child class of Lyft

        declare a method calculateRate(miles)
        return the cost of the ride: base rate of Lyft ride + 10%
     */

    public LyftXL(String name, double miles) {
        super(name, miles);
    }

    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) + (miles * 1.5 * 0.10);
    }


}
