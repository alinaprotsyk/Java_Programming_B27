package day21_nested_loop;

public class DuplicateCharacters {
    public static void main(String[] args) {
        /*
        IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates

    variations:
        Write a program that can return the first duplicated character from a string
        Write a program that can return the index number of the first unique character.
         */
        String word = "AAABCCDEEF";
        String duplicate = "";
        String unique = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                unique +=ch;
            }
            if (count > 1){
              if (duplicate.indexOf(ch) == - 1){
                  duplicate += ch;
              }
            }
        }
        System.out.println(duplicate);
        System.out.println(duplicate.charAt(0));
        System.out.println(word.indexOf(unique.charAt(0)));
    }
}
