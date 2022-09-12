package day16_string;

public class IndexOfExample {
    public static void main(String[] args) {
        String s = "lollipop";
        //          01234567
        System.out.println("index of l " + s.indexOf('l'));
        System.out.println("index of l " + s.lastIndexOf('l'));

        System.out.println("index of i: " + s.indexOf('i'));
        System.out.println("index of i " + s.lastIndexOf('i'));

        System.out.println("index of p " + s.indexOf('p'));
        System.out.println("index of p " + s.lastIndexOf('p'));

        System.out.println("index of e " + s.indexOf('e'));
        System.out.println("index of P " + s.lastIndexOf('P'));

        System.out.println(s.lastIndexOf('A'));

        System.out.println("index of pop: " + s.indexOf("pop"));
        System.out.println("index of Pop: " + s.indexOf("Pop"));
        System.out.println("index of lol: " + s.indexOf("lol"));
        System.out.println("index of Lol: " + s.indexOf("Lol"));


    }
}
