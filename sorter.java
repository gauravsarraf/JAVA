//Question 18
//Write a program to input 10 integers in an array, sort it using selection sort technique and print.

import java.util.*;
class sorter
{  
    Scanner s=new Scanner(System.in);
    int arr[]=new int[10];
    void readlist()
    {
        System.out.println("Enter 10 integers");
        for(int i=0;i<10;i++)
        {
            arr[i]=s.nextInt();
        }
    }
    
    void displaylist()
    {
        int i;
        System.out.println("The 10 integers are: ");
        for(i=0;i<99;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[i]);
    }
    
    int indexofmin(int startindex)
    {
        int min=0;
        for(int i=startindex;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
        }
        return min;
    }
    
    public void secletionsort()
    {
        int min;
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+"  ");
        }
    }
}
