import java.io.*;
public class Arrays
{
  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int rollno[] = new int[50];
       int sub1[] = new int[50];
       int sub2[] = new int[50];
       int sub3[] = new int[50];
       
       void marks(int rollno[],int sub1[],int sub2[],int sub3[])
       {
           int i;
           double sum[] = new double[50];
           for(i=0;i<50;i++)
           {
               sum[i] = (sub1[i]+sub2[i]+sub3[i])/3;
               System.out.println("Average marks obtained by " + rollno[i] + " is" + sum[i]);
            }
            System.out.println();
           for(i=0;i<50;i++)
           {
               if(sum[i]>85.0)
               System.out.println("Average marks obtained by " + rollno[i] + " is " + sum[i] + " which is above 85");
            }
            System.out.println();
           for(i=0;i<50;i++)
           {
               if(sum[i]<45.0)
               System.out.println("Average marks obtained by " + rollno[i] + " is " + sum[i] + " which is below 45");
            }
        }
    }


