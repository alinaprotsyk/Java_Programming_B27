package day06_operators;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = year % 4 == 0;
        System.out.println(" The year is leap: " + isLeapYear);
    }
}
