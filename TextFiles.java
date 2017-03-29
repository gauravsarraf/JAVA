//Question 24
//Write a program to create a text file, store some lines of text and read from it.

import java.util.*;
import java.io.*;
class TextFiles
 {
    public void write()
    {
     String str;    
     Scanner s=new Scanner(System.in);
     try
     {
         FileWriter fw=new FileWriter("names.txt");
         BufferedWriter bw=new BufferedWriter(fw);
         PrintWriter pw=new PrintWriter(bw);
         System.out.println("Enter 5 names");
         for(int i=0;i<5;i++)
         {
             str=s.nextLine();
             pw.println(str);
         }
         pw.close();
         bw.close();
         fw.close();
     }
     catch(IOException e)
     {
         System.err.println(e);
     }
    }
    public void read()
    {
     String str;    
     Scanner s=new Scanner(System.in);
     try
     {
         FileReader fr=new FileReader("names.txt");
         BufferedReader br=new BufferedReader(fr);
         while((str=br.readLine())!=null)
         {
             System.out.println(str);
         }
         br.close();
         fr.close();
     }
     catch(IOException e)
     {
         System.err.println(e);
     }
    }
    public void main()
    {
        write();
        read();
    }
}
