package HomeWork;

public class DayOfWeek {
    public static void main(String[] args) {
       /*
       create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

	Ex:
		2
		Tuesday

	Ex:
		5
		Friday
____________________________
        */
        int day = 5;
        if(day ==1){
            System.out.println("Monday");
        }
        if(day == 2){
            System.out.println("Tuesday");
        }
        if(day == 3){
            System.out.println("Wednesday");
        }
        if(day == 4){
            System.out.println("Thursday");
        }
        if(day == 5){
            System.out.println("Friday");
        }
        if(day == 6){
            System.out.println("Saturday");
        }
        if(day == 7){
            System.out.println("Sunday");
        }
        System.out.println("---------------");
        if(day == 1) {
        System.out.println("Day is monday");

    } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else if(day == 7) {
            System.out.println("Sunday");
        }
        }
}
