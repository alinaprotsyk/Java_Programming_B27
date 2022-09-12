package day27_methods;

public class Vote {
    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */
    public static void eligibleToVote(int age, boolean isUSCitizen){
        if (age >= 18 && isUSCitizen){
            System.out.println("Person is " + age + " old. Eligible to vote");
        } else {
            System.out.println("Person is " + age + " old. Not eligible to vote. Must be at least 18 years old");
        }
    }

    public static void main(StringToChar[] args) {
        eligibleToVote(24, true);
        eligibleToVote(17, true);
    }
}
