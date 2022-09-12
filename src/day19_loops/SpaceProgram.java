package day19_loops;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */

        String str  = "java is cool";
        String space = " ";
        for (int i = 0; i < str.length(); i++) {
          char letter = str.charAt(i);
          if (letter == ' '){
              space += "_";
          } else {
              space += letter + " ";
          }

        }
        System.out.println(space.trim());
    }
}
