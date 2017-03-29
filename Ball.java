
import java.io.*;
public class Ball
{
    public static void main(String args[])throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int c=0,ans=1;
       String S;
       
       while(ans==1)
       {
           System.out.println("Enter a string:");
           S = br.readLine();
           if(S.endsWith("ball"))
           {
               System.out.println(S);
               c=c+1;
            }
            System.out.println("Do you wish to continue? Press 1 for YES and 0 for NO");
            ans = Integer.parseInt(br.readLine());
        }
        System.out.println("Number of words which end with 'ball'= " + c);
    }
}
