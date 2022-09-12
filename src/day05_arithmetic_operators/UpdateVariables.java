package day05_arithmetic_operators;

public class UpdateVariables {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a + 10);
        System.out.println(a);

        a = a + 20;
        System.out.println(a);
        // shorthand operation
        // this is the same as this: b = b + 30;
        int b = 5;
        b +=30;
        System.out.println(b);
    }
}
