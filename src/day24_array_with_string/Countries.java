package day24_array_with_string;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {
        /*
        Given a String array:

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array
         */

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"};
        String  firstCharacter = "";
        String lastCharacter = "";

        for (String eachCountry : countries){
            firstCharacter += eachCountry.charAt(0);
            lastCharacter += eachCountry.charAt(eachCountry.length() -1);
        }
        System.out.println("Countries first character: " + firstCharacter ) ;
        System.out.println("Countries last character: " + lastCharacter + ", " );
        System.out.println();
        String middleEvenChar = "";
        String middleOddChar = "";
        for (String eachCountry : countries){
            if (eachCountry.length() % 2 == 1){
                middleOddChar += eachCountry.charAt(eachCountry.length() / 2) + ", ";
            } else {
                middleEvenChar += eachCountry.charAt(eachCountry.length() / 2 -1) + ", ";
            }
        }
        System.out.println("Countries middle char: " + middleEvenChar + "Countries with one middle character: " + middleOddChar.trim() );
        System.out.println();
        for (String eachCountry : countries){
            char[] arr = eachCountry.toCharArray();
            System.out.println(Arrays.toString(arr));
        }
    }
}
