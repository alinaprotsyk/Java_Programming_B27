package day24_array_with_string;

import java.util.Arrays;

public class StringMethodsWithArray {
    public static void main(String[] args) {
        String s = "hello world";
        char[] letters = s.toCharArray();
        System.out.println(letters); // String uses array internally, so it prints as String
        System.out.println(Arrays.toString(letters));
        System.out.println(s.length()); // count numbers of characters
        System.out.println(letters.length); // count numbers of elements


        System.out.println(letters[0]);
        System.out.println();
        for (char eachLetter : s.toCharArray()){ // : letters (
            System.out.println(eachLetter);
        }
        System.out.println();
String str = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";
        System.out.println(Arrays.toString(str.split(",")));

for (String eachDay : str.split(",")){
    System.out.println(eachDay);
}
String str2 = "Jan-Feb-Mar-Apr-Jun-Jul-Aug-Sep-Nov-Dec";
String[] months = str2.split("-");

for (String eachMonths : months){
    System.out.println(eachMonths);
}

String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));
String str4 ="java";
        System.out.println(Arrays.toString(str4.toCharArray()));
        System.out.println(Arrays.toString(str4.split("")));

    }
}
