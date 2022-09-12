package HomeWork;

public class TimeOfTheDay {
    public static void main(String[] args) {
        /*
        create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night
         */
        int dayTime = 6;
        if(dayTime >=6 && dayTime <=11) {
            System.out.println("Good morning");
        }
        if (dayTime >= 12 && dayTime <= 16) {
            System.out.println("Good evening");
        }
        if(dayTime >= 17 && dayTime <=23 || dayTime >= 0 && dayTime <= 5) {
            System.out.println("Good night");
        }
    }
}
