package day27_methods;

public class StringToChar {
    public static void Sentence(String word) {
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Sentence("I love java");
    }
}
