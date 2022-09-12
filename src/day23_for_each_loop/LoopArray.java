package day23_for_each_loop;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        // print whole array
        int[] nums = {4, 213, 6};
        System.out.println(Arrays.toString(nums));
        // print each on a separate line hard coded index
        System.out.println("Hardcoded:");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        // printing each with loop
        System.out.println("With for loops");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // create our own printing format:
        String arrayString = "Array ~ ";
        for (int i = 0; i < nums.length; i++) {
           arrayString += nums[i]  + " | ";

        }
        arrayString += "~";
        System.out.println(arrayString);
        // go through for each loop
        System.out.println("For each loop");
        for (int eachNumber : nums){ // read every element from the array, beginning to the end
            System.out.println(eachNumber); //    eachNumber == nums[i]----> they are the same
        }
    }
}
