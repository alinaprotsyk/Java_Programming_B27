package day33_arraList_with_collections;

import my_utils.StringUtil;

import java.util.ArrayList;

public class AllPalindrome {
    /*
    All Palindrome

Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye
     */
    public static ArrayList<String> isPalindrome(ArrayList<String> list){

        System.out.println(list);
        ArrayList<String> output = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            String temp = "";
            for (int j = list.get(i).length() -1; j >= 0; j--){
                temp += ""+list.get(i).charAt(j);
            }
            if(temp.equalsIgnoreCase(list.get(i))) {
                output.add(list.get(i));
            }}
        return output;
    }

    public static ArrayList<String> isPalindrome2(ArrayList<String> list) {

        list.removeIf(p -> !p.equalsIgnoreCase(StringUtil.reverse(p)));
        return list;

    }
}
