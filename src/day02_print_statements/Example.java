package day02_print_statements;

public class Example {
    public static void main(String[] args) {
//        System.out.println(" Today is "Friday""); this is not valid, because it thinks the double quotation is for java syntax, but we want to print the character of double quotation
        System.out.println(" \" here \" " );
        System.out.println("Today is \"Friday\"");


        // I want to print a \
        System.out.println( " \\"); // first \  is a syntax, the second \ is the character we want to print

// tabbing here
        System.out.println( "\t\tHello");


        // next line
        System.out.println(" Shopping list:\n1)juice\n2)chips\n3)water  ");
        System.out.println("Shopping list:\n\t1)juice\n\t2)chips\n\t3)water");


    }
}
