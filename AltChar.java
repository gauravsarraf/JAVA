import java.io.*;
public class AltChar
{
       public static void main(String args[])throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String S1,S2,S3 = "";
       int n,i;
       System.out.println("Enter the two strings:");
       S1 = br.readLine();
       S2 = br.readLine();
       
       n = S1.length();
       
       for(i=0;i<n;i++)
       {
           S3 = S3 + S1.charAt(i) + S2.charAt(n-i-1);
        }
        System.out.println(S3);
    }
}
