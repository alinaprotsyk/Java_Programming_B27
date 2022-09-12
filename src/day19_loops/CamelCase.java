package day19_loops;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Camel Case
        IQ

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday
         */

        String first="Today is SUNDAY ";
        String camelStr="";
        String str = first.toLowerCase();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                camelStr += str.substring(i+1, i+2).toUpperCase(); // gives one character after the space
               //str.charAt(i + 1)
                i++;
            }else{
                camelStr += str.charAt(i);
            }

        }
        System.out.println(camelStr);
    }
}
