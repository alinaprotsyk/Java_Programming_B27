package day12_switch;

public class FirstSwitchExample {
    public static void main(String[] args) {
        int day = 9; // numbers from 1-7, where 1 is monday,.... 7 is sunday

        switch (day){
            default: // acts like else, if no other cases matches the default case will run
                System.out.println("Not valid day number, should be 1 to 7");
                break;
            case 1:
                System.out.println("Monday"); // if(day == 1)
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }







    }
}
