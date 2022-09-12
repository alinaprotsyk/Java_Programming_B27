package day06_operators;

public class LogicalExample {
    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp;
        /*
        this is necessary
        isWeekend == true &&isGoodTemp == true;

         */
        System.out.println(" Do bbq: " + doBbq);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter = false;
        boolean getDiscount = isTeacher || isPolice || isFireFighter; // || or only the boolean need to be true, for the result to be true
        System.out.println("get a discount: " + getDiscount);
        // goal is to check: 5 < number < 10
        int number = 8;
        System.out.println(number > 5 && number < 10); // true && true --> true
        System.out.println(number > 10 && number < 5); // true  && false --> false

int age = 40;
boolean inValidAge = age < 0 || age > 120; // false || false , result will be false


    }
}
