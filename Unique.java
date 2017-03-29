//Question 20
//Write a program to print a unique numbers in a range. 

import java.util.*;
class Unique
{
    public static void main()
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter 2 numbers m to be smaller than n");
     int m=obj.nextInt();
     int n=obj.nextInt();     
     int ctr=0;
     for(int i=m;i<=n;i++)
     {
         int x=i;
         String s =Integer.toString(x);
         int l=s.length();
         ctr=0;
         for(int j=0;j<l-1;j++)
         {
             for(int k=j+1;k<l;k++)
             {
                 if(s.charAt(j)==s.charAt(k))
                 {
                     ctr=1;
                     break;
                 }
             }
         }
         if (ctr==0)
         System.out.println(x+" ");
     }
    }
}
