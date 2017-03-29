//Question 29
//Write a program to find the saddle point of a matrix.

import java.util.*;
public class SaddlePoint
{
 public static void main() {
     Scanner s=new Scanner(System.in);
     int row,lrow,prow,col,hcol,pcol,ARR[][],flag=0;
     System.out.print("Enter the size of row : ");
     row=s.nextInt();
     System.out.print("Enter the size of column : ");
     col=s.nextInt();
     ARR=new int[row][col];
     
     for(int i=0;i<row;i++)
     {
         for(int j=0;j<col;j++)
         {
             ARR[i][j]=s.nextInt();
         }
     }
     
     for(int i=0;i<row;i++)
     {
         lrow=ARR[i][0];prow=0;
         for(int j=0;j<col;j++)
             if(ARR[i][j]<lrow)
               {
                   lrow=ARR[i][j];
                   prow=j;
               }
         hcol=ARR[0][prow];pcol=0;
         for(int k=0;k<row;k++)
            if(ARR[k][prow]>hcol)
            {
               hcol=ARR[k][prow];
               pcol=k;
            }
         if(lrow==hcol)
         {
           System.out.println("Saddle Point found at Position Row "+(prow+1)+" Coloumn "+(pcol+1)+" . Element Present = "+hcol);
           flag=1;
         }
     }
 }
}
