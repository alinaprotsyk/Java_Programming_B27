package day24_array_with_string;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] nums = {3, 5, -9, 3, 1, 20};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // max & min

        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length -1]);
        String[] strs = {"Hello", "world", "4four", "#Zebra", "apple", "1aaaaa", "abc"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));


int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        int[] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.equals(a, d));

        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));




    }
}
