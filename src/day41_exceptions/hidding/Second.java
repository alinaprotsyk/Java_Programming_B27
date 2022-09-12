package day41_exceptions.hidding;


import day41_exceptions.hidding.First;

public class Second extends First {

        public static void staticMethod() {
            System.out.println("Static method from Second");
        }

        public void instanceMethodB() {
            staticMethod();
        }
    }

