
import java.io.*;
public class Arrange
{
       public static void main(String args[])throws IOException
       {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String cars[] = new String[5];
       String c[] = new String[5];
       String t = "";
       int i,k;
      
       System.out.println("Enter the names of 5 cars: ");
       for(i=0;i<5;i++)
       {
           cars[i] = br.readLine();
           c[i] = cars[i];
        }
        //Bubble Sort
       for(i=0;i<=3;i++)
        {
            for(k=0;k<=3-i;k++)
            {
                if(cars[k].compareTo(cars[k+1])<0)
                {
                    t = cars[k];
                    cars[k] = cars[k+1];
                    cars[k+1] = t;
                }
            }
        }
        System.out.println("The unsorted array: ");
        for(i=0;i<5;i++)
        {
            System.out.println(c[i]);
        }
        System.out.println("The sorted array(in reverse-alphabetical order): ");
        for(i=0;i<5;i++)
        {
            System.out.println(cars[i]);
        }
    }
}
