//Question 8
//Write a program to create a stack as an array, push, pop and display values in it.

import java.util.*;
class Stack
 {
     int stack[]=new int[3];
     int top;
     void push(int k)
     {
         if(top+1==3)
         {
             System.out.println("Overflow");
         }
            else
            {
                ++top;
                stack[top]=k;
            }
     }
        
     void pop()
     {
         if(top==-1)
         {
             System.out.println("Underflow");
         }
            else
            {
                System.out.println("Value popped: "+stack[top]);
                --top;
            }
     }
            
     void display()
    {
        for(int i=top;i>-1;i--)
        {
            System.out.print(stack[i]+",");
            System.out.println();
        }
    }
        
     void main()
    {
        Scanner s=new Scanner(System.in);
        int val,ch;
        do
        {
            System.out.println("Enter choice");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.exit");
            ch=s.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter value to be pushed");
                        val=s.nextInt();
                        push(val);
                        break;
                case 2: pop();
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
