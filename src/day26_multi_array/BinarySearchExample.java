package day26_multi_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] nums = {1, 55, 100, 200};

        System.out.println(Arrays.binarySearch(nums, 55));
        System.out.println(Arrays.binarySearch(nums, 200));
        System.out.println(Arrays.binarySearch(nums, 300));
        // position it should be +1 and always negative
        System.out.println(Arrays.binarySearch(nums, 0));
        System.out.println(Arrays.binarySearch(nums, 60));

        System.out.println();

        int[] not = {49, 30, 2, 1, 60, 23};
        Arrays.sort(not);
        System.out.println(Arrays.toString(not));
        System.out.println(Arrays.binarySearch(not, 30));
        System.out.println();
        int[] third = {-5, -3, -2, 10, 20};
        int indexOfNeg = Arrays.binarySearch(third, -5);
        System.out.println(indexOfNeg);
    }
}
