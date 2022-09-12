package day38_encapsulation;

public class TaskSquareTest {
    public static void main(String[] args) {
       Square square=new Square(12);
        System.out.println(square.calculatorArea());

        square.setSide(20);
        System.out.println(square.getSide());

        square.setSide(-10);
        System.out.println(square.getSide());

        System.out.println(square.calculatePerimeter());

        System.out.println(square);
    }
}
