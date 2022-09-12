package day35_custom_classes.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alina", 12357, "SDET", 120_000);
        employee1.goToMeeting();
        System.out.println(employee1);

        Employee obj2 = new Employee("Anna");
        System.out.println(obj2);

        Employee obj3 = new Employee("Jane", 9);
        System.out.println(obj3);

        Employee obj4 = new Employee("Penny", 12, "CEO");
        System.out.println(obj4);

        System.out.println("------------");

        EmployeeV2 employee2 = new  EmployeeV2("Alina", 12357, "SDET", 120_000);
        System.out.println(employee2);

        EmployeeV2 obj6 = new  EmployeeV2("Anna");
        System.out.println(obj6);

        EmployeeV2 obj7 = new  EmployeeV2("Jane", 9);
        System.out.println(obj7);

        EmployeeV2 obj8 = new  EmployeeV2("Penny", 12, "CEO");
        System.out.println(obj8);

        // for practice

        Employee[] arr = new Employee[3];
        arr[0] = employee1;
        arr[1] = obj2;
        arr[2] = obj2;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].name);
        System.out.println(arr[0].salary);


        ArrayList<Employee> list = new ArrayList<>();


    }
}
