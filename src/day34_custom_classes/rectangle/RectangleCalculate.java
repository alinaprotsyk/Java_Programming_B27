package day34_custom_classes.rectangle;

import day34_custom_classes.rectangle.Rectangle;

public class RectangleCalculate {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 4.5;
        rectangle1.height = 8.2;
        rectangle1.calculatePerimeter();
        rectangle1.calculateArea();;

        System.out.println(rectangle1);
    }
}
