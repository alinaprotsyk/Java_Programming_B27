package day03_variables;

public class School {
    public static void main(String[] args) {
        int grade1 = 60;
        int grade2 = 70;
        int grade3 = 75;
        int grade4 = 90;
        int grade5 = 100;
        System.out.println("The amount of students in first grade is: " + grade1);
        System.out.println("The amount of students in second grade is: " + grade2);
        System.out.println("The amount of students in third grade is: " + grade3);
        System.out.println("The amount of students in forth grade is: " + grade4);
        System.out.println("The amount of students in fifth grade is: " + grade5);
        int totalAmountOfStudents = grade1 + grade2 + grade3 + grade4 + grade5;
        System.out.println("Total amount of students in the whole school is: " + totalAmountOfStudents);
        double averageGpa = 6.7;
        double numberOfSchoolDays = 250;
        double numberOfSnowDays = 10;
        System.out.println("The average GPA is: " + averageGpa);
        System.out.println("The number of school days is: " + numberOfSchoolDays);
        System.out.println("The number of snow days: " + numberOfSnowDays);

    }
}
