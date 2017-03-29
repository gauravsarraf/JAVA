//Question 1
//Write a program to print the prime factors of numbers in an array.

import java.util.*;
class PrimeFactors
{
    public static void main(int size) 
    {
        Scanner s=new Scanner(System.in);
        int num[]=new int[size];
        System.out.println("Enter "+size+" numbers");
        for(int i=0;i<size;i++)
        {
            num[i]=s.nextInt();
        }
        for(int j=0;j<size;j++)
        {
            System.out.print("The Prime Factors of "+num[j]+" are : ");
            int i=2;
            while(num[j]>1)
              {
                   if(num[j]%i == 0)
                    {
                         System.out.print(i+" ");
                         num[j]=num[j]/i;
                    }
                   else
                    i++;
              }
              System.out.println();
        }
    }
}
