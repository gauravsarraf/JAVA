//Question 2
//Write a program to decrypt input strings using an input shift value.

import java.util.*;
class Decryption
 {
     public static void main()
     {
         Scanner s=new Scanner(System.in);
         int sv,sv1,val,val1;
         String str;
         char ch,ch1,ch2,c,c1,c2;
         System.out.println("Input coded text");
         str=s.nextLine();
         if(str.length()>=100)
         {
             System.out.println("Invalid entry");
             System.exit(5);
         }
         System.out.println("Input shift value");
         sv=(s.nextInt())-1;
         if(sv<=0||sv>=26)
         {
             System.out.println("Invalid entry");
             System.exit(5);
            }
         System.out.println("Decoded text");
         String decod="";
         
         for(int i=0;i<str.length();i++)
         {
             ch=str.charAt(i);
             val=(int)ch;
             if(val+sv<=90)
             {
                 ch1=(char)(val+sv);
                 decod=decod+ch1;
             }
             else if(val+sv>90)
             {
                 val1=90-val;
                 sv1=(sv-val1)-1;
                 ch1=(char)(65+sv1);
                 decod=decod+ch1;
             }
         }
         
         for(int j=0;j<decod.length();j++)
         {
             c=decod.charAt(j);
             if(c=='Q')
             {
                 c1=decod.charAt(j+1);
                 c2=decod.charAt(j-1);
                 if(c1=='Q'||c2=='Q')
                 {
                     decod=decod.replace('Q',' ');
                     continue;
                 }
           
             }
         }
         
         System.out.println(decod);
         System.out.println();
        }
    }
