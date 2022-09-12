package day20_loop;

public class CharacterInString {
    public static void main(String[] args) {
        /*
        Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
         */

        String word = "java";
        String ascii = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ascii += (int)ch + " ";
        }
        System.out.println(ascii.trim());
    }
}
