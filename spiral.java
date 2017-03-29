//Question 10
//Write a program to accept a number n and print the spiral form of a matrix from n2 to 1.

import java.util.*;
public class spiral
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        for(int k=0;k<n;k++)
        {
            for(int h=0;h<n;h++)
            {
                a[k][h]=0;
            }
        }
        int b=n*n;
        int i=0;
        int j=0;
        int flag=0;
        loop:while(b>0)
        {
            try
            {
            if(a[j][i]==0)
            {
          	  if(flag==0)
          	  {
        	      a[j][i]=b;
      	          b--;
      	          i++;
        	  }
         	  else if(flag==1)
         	  {
         	       a[j][i]=b;
                   b--;
         	       j++;
         	  }
          	  else if(flag==2)
         	   {
        	        a[j][i]=b;
            	    i--;
                	b--;
            	}
      	      else if(flag==3)
        	    {
            	    a[j][i]=b;
                	j--;
                 	b--;
           		 }           	 
           	}
            else
        	{
        	    if(flag==0)
                {
                    i--;
                    j++;
                }
                else if(flag==1)
                {
                    j--;
                    i--;                    
                }
                else if(flag==2)
                {
                   i++;
                   j--;
                }
                else if(flag==3)
                {   
                    j++;
                    i++;
                }
        	    flag++;
                if(flag==4)
                   flag=0;
        	   }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                if(flag==0)
                {
                    i--;
                    j++;
                }
                else if(flag==1)
                {
                    j--;
                    i--;                    
                }
                else if(flag==2)
                {
                   i++;
                   j--;
                }
                else if(flag==3)
                {   
                    j++;
                    i++;
                }
                flag++;
                if(flag==4)
                   flag=0;
                continue loop;                  
            }
        }      	        
        for(int k=0;k<n;k++)
        {
            for(int h=0;h<n;h++)
            {
                System.out.print(a[k][h]+"\t");
            }
            System.out.println();
        }
    }
}
