package day19_loops;

public class MultiplyEnd {
    public static void main(String[] args) {
        /*
        Multiply End

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */
        String word = "java";

        int num = 5;
        for (int i = 0; i < num; i++) {
            word += word.charAt(word.length()-1);
        }
        System.out.print(word);
    }
}
