package day42_abstraction.shape;

    /*
    Create a concrete class Circle
    sub class of Sharpe

    create an instance variable radius

    call the parent constructor to set the name of the shape to "Circle" & initialize the radius value for the circle

    implement the two abstract methods for a circle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, and radius
     */
    public class Circle extends Shape {
        public double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        public double area() {
            return radius * radius * Math.PI;
        }

        public double perimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return super.toString() + ", radius: " + radius + ", area: " + area() + ", perimeter: " + perimeter();
        }
    }