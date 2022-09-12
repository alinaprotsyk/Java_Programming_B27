package day37_static.cydeo;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {
        CydeoStudent.schoolInf0();

        CydeoStudent alina = new CydeoStudent("Alina", "Lakewood" ,15);
        System.out.println(alina);
        System.out.println(Arrays.toString(alina.instructors)); // not recommended, just the class name to access
        System.out.println(Arrays.toString(CydeoStudent.instructors));

        System.out.println(CydeoStudent.instructors[1].charAt(3));
        System.out.println(alina.myCoffee.amountLeft);

        alina.drink();
        System.out.println(alina.myCoffee.amountLeft);
CydeoStudent helen = new CydeoStudent("Helen", "Garfield", 12);
        System.out.println(helen.myCoffee.amountLeft);
        helen.drink();
        helen.drink();
        helen.drink();
        System.out.println("alina left " + alina.myCoffee.amountLeft);
        System.out.println("helen left " + helen.myCoffee.amountLeft);

    }
}
