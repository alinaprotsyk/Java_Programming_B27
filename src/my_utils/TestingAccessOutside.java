package my_utils;

import day38_encapsulation.AccessModifiers;

public class TestingAccessOutside {
    public static void main(String[] args) {
        AccessModifiers obj  = new AccessModifiers();
        System.out.println(obj.a);
        //System.out.println(obj.b);  b is default , so it is visible in the same package, so it cannot be accessed in a different package
        // System.out.println(obj.c);  c is private, so it is only visible in the same class
    }

}
