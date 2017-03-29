//Question 11
//Write a program to create a queue as an array, insert, delete and display elements.

import java.util.*;
class Queue
 {
     int f=0,r=-1;
     int q[]=new int[5];
     void insert(int k)
     {
         if(r<q.length-1)
         {
             ++r;
             q[r]=k;
         }
         else
         System.out.println("Overflow");
     }
     
     void delete()
     {
         if(r==-1&&f==0)
         System.out.println("Underflow");
         else
         {
          
             System.out.println("Value deleted: "+q[f]);
             ++f;
          
        }
     }
     
     void display()
     {
         int i;
         for(i=f;i<r;i++)
         {
             System.out.print(q[i]+"--->");
         }
         System.out.print(q[i]);
     }
     
     void main()
     {
       int val,ch;
       Scanner s=new Scanner(System.in);
        do
                {
                    System.out.println();
                    System.out.println("Enter choice");
                    System.out.println("1.insert");
                    System.out.println("2.delete");
                    System.out.println("3.display");
                    System.out.println("4.exit");
                    ch=s.nextInt();
                    switch(ch)
                    {
                        case 1: System.out.println("Enter value to be inserted");
                                val=s.nextInt();
                                insert(val);
                                break;
                        case 2: delete();
                                break;
                        case 3: display();
                                break;
                        case 4: System.exit(0);
                                break;
                        default: System.out.println("wrong input");
                    }
                }
                while(ch!=4);
      }
        }
