package groupStudies;

public class MethodPalindrome {

    /*
    create a method that will accept a String and find if it Palindrome or not(boolean)
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("java"));

    }

    public static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse +=str.charAt(i);
        }
     /*   if (str.equalsIgnoreCase(reverse)){
            return true;
        } else {
            return false;
        }
*/
        return str.equalsIgnoreCase(reverse);
    }
}
