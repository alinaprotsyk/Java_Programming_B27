package day10_if_statement;

public class BiggestNumber {
    public static void main(String[] args) {

        int first = 1;
        int second = 30;
        int third = 5;
        int biggest ;
// you do not to do both options
        if(first > second && first > third){
            //System.out.println(first + " is the biggest ");
            biggest = first;

        } else if (second > first && second > third) {
           // System.out.println(second + " is the biggest");
            biggest = second;

        } else {
           // System.out.println(third + " is the biggest");
            biggest = third;
        }
        System.out.println(biggest + " is the biggest");
    }

}
