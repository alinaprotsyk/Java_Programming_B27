package day39_inheritance.job;

public class Tester extends Employee{
    /*
    - Tester class inherits Employee class
    - create additional variables:
        bugs found
    - create method:
        test()
            Example output: prints Running the regression
     */

    boolean bugFound;
    public void test(){
        System.out.println("Running the regression");
    }
}
