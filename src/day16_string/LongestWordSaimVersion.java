package day16_string;

public class LongestWordSaimVersion {
    public static void main(String[] args) {
        String word1 = "concatenation";
        String word2 = "java";
        String word3 = "application";
        String longest = "";

        if(word1.contains("a") && word1.length() > longest.length()){
            longest = word1;
        }

        if(word2.contains("a") && word2.length() > longest.length()){
            longest = word2;
        }

        if(word3.contains("a") && word3.length() > longest.length()){
            longest = word3;
        }

        System.out.println(longest + " is the longest");
    }
}
