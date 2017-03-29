//Question 28
//Write a program to create a binary file which stores the marks obtained by students, read and write from the file.

import java.util.*;
import java.io.*;
class MarksRead
 {
     public static void main()throws IOException
     {
     String str;
     int m1,m2,m3,roll;
     double p=0.0;
     boolean eof=false;    
     Scanner s=new Scanner(System.in);
     try
     {
         FileInputStream fis=new FileInputStream("marks.dat");
         DataInputStream dis=new DataInputStream(fis);
         while(eof!=true)
         {
             try
             {
             str=dis.readUTF();
             roll=dis.readInt();
             m1=dis.readInt();
             m2=dis.readInt();
             m3=dis.readInt();
             System.out.println("Name: "+str+"   Roll No: "+roll);
             System.out.println("Marks1: "+m1+"   Marks2: "+m2+"    Marks3: "+m3);
             p=((m1+m2+m3)*100)/300;
             System.out.println("Percentage:  "+p);
            }
            catch(EOFException eo)
            {
                System.out.println();
                System.out.println("END OF REPORT");
                eof=true;
            }
            catch(IOException i)
            {
                System.err.println(i);
            }
         
        }
        dis.close();
        fis.close();
    }catch(FileNotFoundException e)
     {
         System.err.println(e);
        }
    }
}
