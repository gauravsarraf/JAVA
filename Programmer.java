//Question 21
//Write a program to create and abstract class Employee and a subclass Programmer to calculate salary. Implement the concept of inheritance.

import java.util.*;
public class Programmer extends Employee
 {
     Scanner s=new Scanner(System.in);
     double bonus;
     double salary;
     Programmer(String name, int id, double salary)
     {
         super(name,id);
         this.salary=salary;
         bonus=0.0;
        }
     public void calcSalary()
     {
         System.out.println("Enter bonus");
         bonus=s.nextDouble();
         salary=salary+bonus;
         System.out.println(salary);
        }
    }
