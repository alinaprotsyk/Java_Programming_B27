package day26_multi_array;

import java.sql.Array;
import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        /*
        Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array
         */

        int[][] nums = {
                {1, 5, 2, 23},
                {-12, 41, -5, -2},
                {1, 5, 1, 5}
        };
        Arrays.sort(nums[0]);
        Arrays.sort(nums[1]);
        Arrays.sort(nums[2]);
        int max = 0;
        int min = nums[0][0];
        for (int[] each : nums){
            System.out.println(Arrays.toString(each) + "\nmin: " + min + each[0] + "\nmax: " + each[each.length - 1] );
            for (int eachNum : each){
                if (eachNum > max){
                    max = eachNum;
                } else if (eachNum < min) {
                    min = eachNum;
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " +max);






    }
}
