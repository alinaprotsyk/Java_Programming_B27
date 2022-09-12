package day11_nested;

public class Army {
    public static void main(String[] args) {

/*

 */
        int age = -40;
        boolean hasDiploma = false;
        boolean isCitizen = false;
        if( (age >= 18 && age <= 35) && hasDiploma && isCitizen) {
            System.out.println("You Qualify for the Army");
        }else {
            // multi branch is to give info about the age
           if(age < 0 || age > 120){
               System.out.println("Not a valid age number");
           } else if(age < 18){
               System.out.println("You are too young, need to be at least 18");
           } else {
               System.out.println("You are too old, limit is 35 years old");
           }
           // to check about diploma
            if(!hasDiploma){ // if you do not have diploma
                System.out.println("You need at least a highschool diploma");
            }
            // to check about citizenship
            if(!isCitizen){
                System.out.println("You need to be a citizen to aply");
            }
            // end of the else block
        }
    }
}
