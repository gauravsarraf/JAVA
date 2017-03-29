//Question 12
//Write a program to input integers into an array, using recursion, sort it with selection sort technique and print.

import java.util.*;
class SorterRecurison
{
    Scanner s=new Scanner(System.in);
    void selectionSort(int[] array, int startIndex)
    {
        if ( startIndex >= array.length - 1 )
        return;
        int minIndex = startIndex;
        for ( int index = startIndex + 1; index < array.length; index++ )
        {
            if (array[index] < array[minIndex] )
            minIndex = index;
        }
        int temp = array[startIndex];
        array[startIndex] = array[minIndex];
        array[minIndex] = temp;
        selectionSort(array, startIndex + 1);
    }
    
    void main()
    {
        int n;
        int arr[];
        System.out.println("Enter size of the array");
        int size=s.nextInt();
        arr=new int[size]; 
        System.out.println("Enter "+size+" numbers");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        selectionSort(arr,0);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
