package day39_inheritance.job;

public class EmployeeRunner {

    /*
    Create objects of all three to see which variables and methods each object has access to
     */
    public static void main(String[] args) {
        Tester employee1 = new Tester( );
        employee1.name = "Alina";
        employee1.isFullTime =true;
        employee1.salary = 120_000.99;
        employee1.bugFound = true;
        employee1.test();
        // employee1.featuresCreated; we can not access because we did not declare the object of the developer class.
        //employee1.develop();we can not access because we did not declare the object of the developer class.
        System.out.println(employee1);

        Developer employee2 = new Developer();
        employee2.name = "Helen";
        employee2.isFullTime =true;
        employee2.salary = 150_000.99;
        employee2.featuresCreated = false;
        employee2.develop();
        //employee2.bugFound = true;
        //employee2.test();


    }
}
