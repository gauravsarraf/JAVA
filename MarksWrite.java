//Question 28
//Write a program to create a binary file which stores the marks obtained by students, read and write from the file.

import java.util.*;
import java.io.*;
class MarksWrite
 {
     public static void main()
     {
     String str;    
     int m1,m2,m3,roll;
     Scanner s=new Scanner(System.in);
     try
     {
         FileOutputStream fos=new FileOutputStream("marks.dat");
         DataOutputStream dos=new DataOutputStream(fos);
         int ctr=1;
         System.out.println("Enter name, roll number and marks");
         str=s.nextLine();
         dos.writeUTF(str);
         roll=s.nextInt();
         dos.writeInt(roll);
         m1=s.nextInt();
         m2=s.nextInt();
         m3=s.nextInt();
         dos.writeInt(m1);
         dos.writeInt(m2);
         dos.writeInt(m3);
         dos.close();
         fos.close();
        }
     catch(IOException e)
     {
         System.err.println(e);
        }
    }
}