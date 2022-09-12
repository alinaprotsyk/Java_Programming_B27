package HomeWork;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Unit2 {
    public static void main(String[] args) {
        int[][] nums = {
                {4, 2, 15},
                {31, 5, 12, 6, 12},
                {31, 1},
                {1, 41, 5}
        };
        System.out.println(nums.length);
        System.out.println(nums[1].length);

        for (int each : nums[2]){
            System.out.println(each);
        }
    }
}
