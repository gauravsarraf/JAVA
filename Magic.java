//Question 30
//Write a program to print only the magic numbers in given array of any size.

import java.util.*;
class Magic
{
    public static void main(int size) 
    {
        int sum=0,r;
        Scanner s=new Scanner(System.in);
        int num[]=new int[size];
        System.out.println("Enter "+size+" numbers");
        for(int i=0;i<size;i++)
        {
            num[i]=s.nextInt();
        }
        System.out.print("The Magic numbers are: ");
        
        for(int j=0;j<size;j++)
        {
            int n=num[j];
            do
            {
                sum=0;
                while(n>0)
                {
                    r=n%10;
                    n=n/10;
                    sum=sum+r;
                }
                n=sum;
            }
            while(sum>=10); 
            if(sum==1)
            System.out.print(num[j]+" ");
        }
    }
}
