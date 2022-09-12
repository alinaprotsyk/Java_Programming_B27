package day31_ArrayList;

import java.util.ArrayList;

public class Characters {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
         */

        ArrayList<Character> name = new ArrayList<>();
        name.add('A');
        name.add('l');
        name.add('i');
        name.add('n');
        name.add('a');
        System.out.println(name);

        System.out.println();
      /*  System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
        System.out.println(name.get(4));
        */

        for (char each : name) {
            System.out.println(each);
        }

    }
}
