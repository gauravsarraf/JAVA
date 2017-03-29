//Question 19
//Write a program to input a birthday and print the its day of the year.

import java.util.*;
class BirthDay
 {
     public static void main()
     {
         Scanner s=new Scanner(System.in);
         int flag=0;
         int day[]={31,28,31,30,31,30,31,31,30,31,30,31};
         System.out.println("Enter your date of birth in dd mm form");
         int dd=s.nextInt();
         int mm=s.nextInt();
         if(mm>12||dd>day[mm-1])
            {
                System.out.println("INVALID DATE");
                System.exit(0); 
            }
         else
         {
            System.out.println("VALID DATE");
             for(int i=0;i<mm;i++)
             flag=flag+day[i];
            flag=flag-(day[mm-1]-dd);
            System.out.println(flag);
        }
    }
}
