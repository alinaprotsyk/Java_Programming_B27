package day40_inheritance.seasons;

public class CheckSeason {
    /*
    Create a class CheckSeason

    create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

    List the is a relations of all the classes
     */
    public static void main(String[] args) {

        Winter winter = new Winter("Winter", 5, -10);
        System.out.println(winter);
        System.out.println(winter.activity());

        System.out.println();

        Summer summer = new Summer("Summer", 34, 19);
        System.out.println(summer);
        System.out.println(summer.activity());

        System.out.println();

        Fall fall = new Fall("Fall", 19, 10);
        System.out.println(fall);
        System.out.println(fall.activity());

        System.out.println();

        Spring spring = new Spring("Spring", 21, 16);
        System.out.println(spring);
        System.out.println(spring.activity());





    }
}
