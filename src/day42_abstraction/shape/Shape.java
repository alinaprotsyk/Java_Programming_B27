package day42_abstraction.shape;

public abstract class Shape {
    /*
    Create an abstract class Shape

    define a final variable name

    define a constructor to initialize the name of the shape

    define two abstract methods:

        area()
        perimeter()

    override the toString to return the name, area and perimeter
     */

    public final String name;
    public Shape(String name){
        this.name = name;

    }
    public abstract double area();
    public abstract double perimeter();


    @Override
    public String toString() {
        return "Shape :" + name + "\nArea: " + area() + "\nperimeter: " + perimeter();
    }
}
