package day42_abstraction.shape;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle.radius);
        System.out.println(circle);

        System.out.println("--------------------------");

        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.length);
        System.out.println(rectangle.width);
        System.out.println(rectangle);
    }
}
