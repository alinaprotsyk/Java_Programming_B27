package day39_inheritance.job;

public class Developer  extends Employee{
    /*
    - Developer class inherits Employee class
    - create additional variables:
        features created
    - create method:
        develop()
            Example output: prints Creating more features

     */
    boolean featuresCreated;

    public  void develop() {
        System.out.println("Creating more features");
    }
}
