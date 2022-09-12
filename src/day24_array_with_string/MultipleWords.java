package day24_array_with_string;

public class MultipleWords {
    public static void main(String[] args) {
        /*
        Multiple Words

	Given a String of words that are separate by comma and spaces. Find and print any words that have more than one word

	Example

		Input:
			knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer
		Output:
			wooden spoons
			trash can
			dish washer
         */

        String word = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] str = word.split(", ");

        for (String eachWord : str) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }
        }
    }
}
