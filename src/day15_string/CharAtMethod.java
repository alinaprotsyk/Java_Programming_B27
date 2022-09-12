package day15_string;

public class CharAtMethod {
    public static void main(String[] args) {


        String s = "java";
        //          0123
        System.out.println("First character " + s.charAt(0));

        System.out.println("Second character " + s.charAt(1));
        System.out.println("Third character " + s.charAt(2));
        System.out.println("Fourth character " + s.charAt(3)); // s.charAt(s.lenghth() -1)
       // System.out.println("Invalid char: " + s.charAt(100)); 100 is not a valid index in our String
        System.out.println("Lenght " + s.length());
        System.out.println("Last index: " + 3); // lenght - 1 ----> 4 - 1 = 3

        // reverse my String, hardcoded: goal is to see; avaj
        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println();

        System.out.println(" " + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0));
    }
}
