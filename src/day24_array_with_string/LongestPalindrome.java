package day24_array_with_string;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*
        [IQ] Longest Palindrome

	Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
         */
        String[] str = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String  biggestPalindrome = "";
        for (String eachWord : str){
            String reverse = "";
            for (int i = eachWord.length()-1; i >= 0; i--){
                reverse += eachWord.charAt(i);
            }
            if (eachWord.equals(reverse) && eachWord.length() > biggestPalindrome.length()){
                biggestPalindrome = eachWord;
            }
        }
        System.out.println(biggestPalindrome);
    }
}
