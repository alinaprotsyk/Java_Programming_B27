package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSum {
    public static void main(String[] args) {


    /*
    String Sum

Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */

        ArrayList<String> nums = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList<Integer> sumNums = new ArrayList<>();
        for (String each: nums) {
            int sum = 0;
            for (int i = 0; i < each.length(); i++) {
                int numbers = Integer.parseInt(""+ each.charAt(i));
                sum += numbers;
            }
           sumNums.add(sum);
        }
        System.out.println(sumNums);
    }
}
