package day40_inheritance.seasons;

public class Season {
    /*
    instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes

     */

    String name;
    int highestAverageTemp;
    int lowestAverageTemp;

    public Season(String name, int highestAverageTemp, int lowestAverageTemp) {
        this.name = name;
        this.highestAverageTemp = highestAverageTemp;
        this.lowestAverageTemp = lowestAverageTemp;
    }

    public String activity() {
        return "";
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemp=" + highestAverageTemp +
                ", lowestAverageTemp=" + lowestAverageTemp +
                '}';
    }
}
