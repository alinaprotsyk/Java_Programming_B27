package day38_encapsulation;

public class Square {


    /*
    create a class called Square
- data:
side
- constructor
- create a constructor that creates a Square object with the
side
call setter here
- encapsulate the Square class
- setter condition: side must be a positive number
otherwise it will not be assigned to the instance variable
- other methods methods:
- calculateArea()
calculate and return the area of a
Square
- calculatePerimeter()
calculate and return the perimeter
of a Square
- toString()
print the side, area, and perimeter of the Square object
Create a separate class to create and test the Square objects

     */

    private int side;

    public Square(int side) {
        if (side > 0) {
            this.side = side;
        }
    }
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public int calculatorArea(){
        int area= side*side;
        return area;
    }
    public int calculatePerimeter(){
        int perimeter= 4*side;
        return perimeter;
    }

    public String toString() {
        return "TaskSquare{" +
                "side=" + side +
                '}';
    }
}
