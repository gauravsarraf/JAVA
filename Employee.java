//Question 21

public abstract class Employee
 {
     String name;
     int id;
     Employee(String name, int id)
     {
         this.name=name;
         this.id=id;
     }
     public abstract void calcSalary();
 }