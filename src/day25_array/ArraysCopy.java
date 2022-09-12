package day25_array;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] other = nums; // this is not creating a new array, it is pointing the same array as line 7
        System.out.println("Before");
        System.out.println(Arrays.toString(nums));

        nums[0] = 10; // reassign the first index to 10
        System.out.println("After");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));


        other[2] = 25;
        System.out.println("After w/ other");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));


        int[] arr ={3, 4, 1, 5, 12, 5, -10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // copy of

        int[] a = {5, 10, 15};

        int[] b = Arrays.copyOf(a, 3); // new array with size 3
        System.out.println("Before");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[1] = 100;
        System.out.println("After");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // we have two arrays but we only changed middle element of the first array but because they were separate arrays
    }
}
