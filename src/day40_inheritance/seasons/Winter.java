package day40_inheritance.seasons;

public class Winter extends Season{
    /*
        Create a class Winter

        child class of Season

        constructor: set values to variables

        methods:
            activity(): Print Use Fireplace
         */

    public Winter(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }
    @Override
    public String activity(){
        return super.activity() + "Use Fireplace";

    }
}
