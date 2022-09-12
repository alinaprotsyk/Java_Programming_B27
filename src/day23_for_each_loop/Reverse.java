package day23_for_each_loop;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        /*
        Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
         */
        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0 ; i--, j++) { // i goes backwards
       reverse[j] = arr[i]; // or we can do: for (int i = arr.length - 1;j = 0; i >= 0 ; i--) { // i goes backwards
            // or for (int i = arr.length - 1; i >= 0 ; i--, j--) { // i goes backwards
            //       reverse[j] = arr[i];
            reverse[j] = arr[i];

        }
        System.out.println(Arrays.toString(reverse));
    }
}
