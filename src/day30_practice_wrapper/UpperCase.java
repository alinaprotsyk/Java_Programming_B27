package day30_practice_wrapper;

public class UpperCase {
    public static void main(String[] args) {

isUpperEqualToLower("JAVA java");

        System.out.println("JAVA java");
    }
    /*
    Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
    str = "JAVA java";

output:

    true
     */
  public static boolean isUpperEqualToLower(String str) {
        int countUpper = 0;
        int countLower = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)) {
                countUpper++;
            } else if (Character.isLowerCase(i)) {

            }
            countLower++;
        }
        return (countUpper == countLower);

    }
}
