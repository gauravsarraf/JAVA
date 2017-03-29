//Question 4
//Write a program to input an array of any size, sort it using bubble sort technique and search for a particular value in the array using binary search technique.

import java.io.*;
class myarray
{
    int arr[]=new int[200];
    int n;
    
    myarray()
    {
        for(int i=0;i<200;i++)
        {
            arr[i]=0;
        }
    }
    
    void readarray()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the size of the array.");
        n=Integer.parseInt(in.readLine());
        System.out.println("Please enter the numbers.");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }
    }
    
    void BubSort()throws IOException
    {
        int temp;
        for(int i=0;i<(n-1);i++)
        {
            for(int j=0;j<(n-1)-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    void displayarray()throws IOException
    {
        System.out.println("the elements of the sorted array are:");
        for(int i=0;i<n;i++)
        {
            if(i<n-1)
            System.out.print(arr[i]+",");
            else
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    int binarysearch(int value)throws IOException
    {
        int start=0, mid=0, end=(n-1),k=0,sub=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]<value)
            start=mid+1;
            if(arr[mid]>value)
            end=mid-1;
            if(arr[mid]==value)
            {
                k++;
                sub=mid;
                break;
            }
        }
        
        if(k==1)
        return sub;
        else
        {
            sub=-999;
            return sub;
        }   
    }
    
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        myarray ob=new myarray();
        ob.readarray();
        ob.BubSort();
        ob.displayarray();
        System.out.println("Enter the number to be found");
        int v1=Integer.parseInt(in.readLine());
        System.out.println("The subscript= "+ob.binarysearch(v1));
    }
}
