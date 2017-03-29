//Question 16
//Write a program to find the sum of the series x2/11 + x4/22 + x6/33 +…. using recursion technique.

import java.util.*;
class sum_series
 {
     Scanner s=new Scanner(System.in);
     int x,n,p1,k,k1,pow,j;
     double sum;
     sum_series()
     {
         j=0;
         pow=2;
         k=0;
         k1=0;
         x=0;
         p1=1;
         sum=0.0;
         n=0;
     }
     
     void readLimit()
     {
         System.out.println("Enter n");
         n=s.nextInt();
     }
     
     int getPower(int m,int p)
     {
         if(p==0)
         return p1;
         else
         {
             p1=p1*m;
             p=p-1;
             return getPower(m,p);
            }
     }
     
     void Sum()
     {
         System.out.println("Enter x");
         x=s.nextInt();
         readLimit();
         for(int i=1,j=1;i<=n;i++,pow+=2,j++)
         {
             k=(getPower(x,pow));
             System.out.println(i+" : "+k);
             k1=(getPower(i,j));
             System.out.println(i+" : "+k1);
             sum=sum+(k/k1);
         }
         System.out.println(sum);
     }
    }
