package day16_string;

public class FirstWord {
    public static void main(String[] args) {
        /*
        [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.

    Input:
        Java is a fun language
    Output:
        is a fun language Java

         */
        String sentence = "Java is a fun language";
        int firstWordEnd = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, firstWordEnd);
        String secondPart = sentence.substring(firstWordEnd +1);
        System.out.println(secondPart + " " + firstWord);
    }
}
