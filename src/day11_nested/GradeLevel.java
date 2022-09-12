package day11_nested;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Create a class called GradeLevel, Given a number grade level
determine and print which school type someone is in.
grade level and types are:

	any number less than 1 or more than 18 is not valid
	1-5: Elementary school
	6-8: Middle school
	9-12: High school
	13-16: College
	17-18: Grad School
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your grade lever");
        int grade = input.nextInt();
        String schoolType = " ";

        if(grade > 1 && grade < 18) {

            if(grade >= 1 && grade <=5){
                schoolType = "Elementary school";

            } if(grade >=6 && grade <= 8){
                schoolType = "Middle school";

            } if(grade >= 9 && grade <= 12){
                schoolType = "High school";

            } if(grade >= 13 && grade <= 16){
                schoolType = "College";

            } if(grade >= 17 && grade <= 18){
                schoolType = "Grad School";

            }
            System.out.println("School type: " + schoolType);
        } else {
            System.out.println("Not valid");
        }
    }
}
