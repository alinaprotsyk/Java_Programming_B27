package day42_abstraction.shape;

public class Rectangle extends Shape {
    /*
    Create a concrete class Rectangle
    sub class of Sharpe


    create an instance variable length
    create an instance variable width

    call the parent constructor to set the name of the shape to "Rectangle" & initialize the length and width values for the shape

    implement the two abstract methods for a rectangle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, length, and width

     */
    double length;
    double width;
    public Rectangle(double length, double width){
        super("Rectangle");
        this.length= length;
        this.width = width;

    }
    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return super.toString() + ", length: " + length + ", width: " + width + ", area: " + area() + ", perimeter: " + perimeter();
    }

}
