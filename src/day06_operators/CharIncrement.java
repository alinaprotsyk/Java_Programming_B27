package day06_operators;

public class CharIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        char letter2 = 'a';
        System.out.println(++letter2); //pre increment, so 1 is added first than the expression finishes
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        char digits = '9';
        System.out.println(digits--); // this is character 9, not a number 9
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits); // this is printing character
        System.out.println((int)digits ); // cast the character to an int which is means that is prints the ascii number for the character

        System.out.println(65);
        System.out.println((char)65);

    }
}
