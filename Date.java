//Question 6
//Write a program to accept a date and count the number of days from 1st of January to the date entered. 

import java.util.*;
class Date
 {
     Scanner s=new Scanner(System.in);
     int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
     int flag,f;
     int dd, mm;
     public Date()
     {
         f=0;
         flag=0;
         dd=0;
         mm=0;
     }
     public Date(int nd, int nm)
     {
         f=0;
         flag=0;
         dd=nd;
         mm=nm;
     }
     int datetodatenumber()
     {
         for(int i=0;i<mm;i++)
         {
             flag=flag+days[i];
         }
         flag=flag-(days[mm-1]-dd);
         return flag;
     }
     Date datenumbertodate(int dn)
     {
         Date d=new Date();
         int ctr=1;
         int sum=days[0];
         for(int i=1;i<12;i++)
         {
             if(sum>=dn)
             {
                 d.mm=ctr;
                 break;
             }
             else
             {
                 sum=sum+days[i];
                 ctr++;
             }
         }
         int d1=(sum-(sum-dn))-days[ctr-1];
         System.out.println(d1+" - "+d.mm);
         return d;
        }
    }             

