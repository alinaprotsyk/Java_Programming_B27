package day23_for_each_loop;

public class HundredNumbersArray {
    public static void main(String[] args) {
        /*
        1. Create an int array called numbers that has length of 100
	2. Assign 1-100 to each index of the array. Then print your number array
         */



    int [] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[1] = i + 1;
            System.out.println(numbers[i]);

        }
    }
}
