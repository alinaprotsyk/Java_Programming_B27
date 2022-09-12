package day40_inheritance.seasons;

public class Summer extends Season {
    /*
            Create a class Summer

            child class of Season

            constructor: set values to variables

            methods:
                activity(): Drink Lemonade
         */

    public Summer(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }

    public String activity(){
        return super.activity() + "Drink Lemonade";
    }
}