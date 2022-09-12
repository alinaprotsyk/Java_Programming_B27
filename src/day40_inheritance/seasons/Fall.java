package day40_inheritance.seasons;

public class Fall extends Season {
    /*
        Create a class Fall

        child class of Season

        constructor: set values to variables

        methods:
            activity(): Read A Book
         */

    public Fall(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public String activity(){
        return super.activity() + "Read A Book";}
}