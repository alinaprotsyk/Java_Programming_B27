package day26_multi_array;

import java.util.Arrays;

public class ExampleOne {
    public static void main(String[] args) {
        char[] upper = {'R', 'J', 'A'};
        char[] lower = {'p', 'z', 'q'};
        char[] other = {'4', '#', '*', '$', '&'};

        char[][] chars = new char[3][]; // {upper, lower, other}

    chars[0] = upper; // storing the upper char as the first element of the 2d array
        chars[1] = lower;
        chars[2] = other;
        // printing each inner array
        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        // printing the whole 2d
        System.out.println(Arrays.deepToString(chars)); // this method is used to print multidimensional arrays
    }


}
