package day39_inheritance.people;

public class Employee  extends Person{

    double salary;

     public Employee(String name, int age, double salary){
         super(name, age);
         this.salary = salary;
     }
}



/*
 public Employee(){
         super(); // calls parents constructor with no args
     }

 */