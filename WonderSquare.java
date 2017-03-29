//Question 17
//Write a program to check if a give matrix is a wondrous square.

import java.util.*;
class WonderSquare
 {
 int arr[][],arr1[];;
  int n,i,j,x=0,r,c;
  int flag;
  Scanner s=new Scanner(System.in);
  public void take()
  {
       System.out.println("Enter the size of array:");
       n=s.nextInt();
       arr=new int[n][n];
       arr1=new int[2*n];
       for(i=0;i< n;i++)
       {
           for(j=0;j< n;j++)
           {
                 System.out.println("Enter the value:");
                 arr[i][j]=s.nextInt();
           }
       }
       System.out.println("The matrix is"); 
         for(i=0;i< n;i++)
         {
             r=0;
             c=0;
              for(j=0;j< n;j++)
              {
                  System.out.print(arr[i][j]+" ");
                   r=r+arr[i][j];
                   c=c+arr[j][i];
               }
               System.out.println();
               arr1[x]=r;
               arr1[x+n-1]=c;
               x++;
           }
           for(i=0;i< x;i++)
           {
                if(arr1[i]!= 0.5 * n * (n*n + 1))
                break;
            }
            if(i==x)
            System.out.println("YES IT REPRESENTS A WONDROUS SQUARE.");
            else
            System.out.println("IT IS NOT A WONDROUS SQUARE.");
    }
  public static void main(String args[])throws Exception
  {
      WonderSquare ob=new WonderSquare();
      ob.take();
   }
}  
