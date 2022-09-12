package day27_methods;

public class CharacterMethods {
    /*
    Character Methods

    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9
     */


    public static void upperCaseLetters(){
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void lowerCase(){
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void reverseUpperCase(){
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void reverseLowerCase(){
        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void letters(){
        for (char i = '0'; i <= '9'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        upperCaseLetters();
        lowerCase();
        reverseLowerCase();
        reverseUpperCase();
        letters();
    }
}
