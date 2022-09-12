package day22_array;

public class Initials {
    public static void main(String[] args) {
        /*
        Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

No loop yet
         */
        String [] fullNames = {"James Bonds", "Harry Potter", "Tony Stark"};
        System.out.println("" + fullNames[0].charAt(0) + fullNames[0].charAt(fullNames[0].indexOf(" ") + 1));
        System.out.println("" + fullNames[1].charAt(0) + fullNames[1].charAt(fullNames[1].indexOf(" ") + 1));
        System.out.println("" + fullNames[2].charAt(0) + fullNames[2].charAt(fullNames[2].indexOf(" ") + 1));
    }
}
