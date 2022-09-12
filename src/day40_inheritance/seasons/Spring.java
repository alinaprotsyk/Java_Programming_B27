package day40_inheritance.seasons;

public class Spring extends Season {
    /*
        Create a class Spring

        child class of Season

        constructor: set values to variables

        methods:
            activity(): Go Outside
         */

    public Spring(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public String activity() {
        return super.activity() + "Go Outside";
    }
}