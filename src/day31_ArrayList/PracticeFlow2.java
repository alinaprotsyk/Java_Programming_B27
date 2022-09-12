package day31_ArrayList;

import java.util.ArrayList;

public class PracticeFlow2 {
    public static void main(String[] args) {
        /*
        Practice flow:

Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
         */

        ArrayList<String>  words = new ArrayList<>();
        words.add("Iron Man");

        words.add("Spider Man");

        words.add("Thor");

        words.add("Captain America");

        words.add("Hawkeye");

        words.remove(2);
        System.out.println(words);
        words.remove("Iron Man");
        System.out.println(words);
        words.remove(0);
        System.out.println(words);



        // removing in Integer ArrayList

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(300);
        nums.add(800);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);

        // nums.remove(300);  the 300 is an int here, so it is trying to remove index 300
        nums.remove((Integer) 300); // 300 is being cast to Integer, so it will remove the element
        System.out.println(nums);



    }
}
