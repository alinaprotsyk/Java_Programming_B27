package day24_array_with_string;

import java.util.Arrays;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        /*
        [IQ] Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.

Note the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
         */

        int[] nums = {4,3,1,4,5,2,4,8,4,8};

        Arrays.sort(nums);
        /*
        int biggestNumber = nums[nums.length-1];

        int secondBiggest = nums[0];
        for (int num : nums){
            if (num > secondBiggest && num < biggestNumber){
                secondBiggest = num;
            }
        }

        System.out.println("Second biggest number: " + secondBiggest);
/*
 int[] arr = {1,4,3,1,4,5,2,4,7,8,4,8};

        int biggestNum = arr[0];
       for(int num : arr){
           if(num > biggestNum){
               biggestNum = num;
           }
       }
        int secondBiggest = arr[0];
        for(int num : arr) {
            if (num > secondBiggest && num < biggestNum) {
                secondBiggest = num;
            }
        }
        System.out.println("Second Biggest Number: " + secondBiggest);
 */

        System.out.println(Arrays.toString(nums));

        System.out.println("Max number: " + nums[nums.length -1 ]);
       //  System.out.println("Second Max: " + nums[nums.length - 2]); this does not work because 8 is duplicate so it gives wrong second max

        int max = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--){ // read the numbers from the end, we sorted so i will keep running until i find a new number that is not the same as the max number
            if (nums[i] != max){
                System.out.println("Second max: " + nums[i]);
                break;
            }
        }
    }
}
