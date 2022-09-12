package day20_loop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc

         */
        String word = "abcabc";
        String duplicate = "";
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);

            if (duplicate.indexOf(ch) == -1){
                duplicate += ch;

            }
        }
        System.out.println(duplicate);
    }
}
