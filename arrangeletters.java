
import java.io.*;
public class arrangeletters
{
    void formalletters(String S)
    {
        char ch;
        int av,i,l;
       
        System.out.println("Original word= " + S);
        S = S.toUpperCase();
        System.out.println("Word in capitals= " + S);
        
        l = S.length();
        
        System.out.print("Word after sorting= ");
        for(av=65;av<=90;av++)
        {
           for(i=0;i<l;i++)
           {
               ch = S.charAt(i);
               if(ch == (char)av)
               System.out.print(ch);
            }
        }
    }
    public static void main(String args[])throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String S1;
       
       System.out.println("Enter the String: ");
       S1 = br.readLine();
       
       arrangeletters obj = new arrangeletters();
       obj.formalletters(S1); 
    }
}
