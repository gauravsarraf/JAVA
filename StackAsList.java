//Question 15
//Write a program to create a stack with linked list implementation, push, pop and display values in it. 

class StackAsList
 {
     int data;
     StackAsList temp, next, start;
     StackAsList()
     {
         data=0;
         temp=next=start=null;
     }
     
     void push(int k)
     {
         StackAsList temp=new StackAsList();
         temp.data=k;
         if(start==null)
         {
             start=temp;
         }
         else
         {
             temp.next=start;
             start=temp;
         }
     }
     
     void display()
     {
         StackAsList temp=new StackAsList();
         temp=start;
         if(temp!=null)
         {
             while(temp.next!=null)
             {
                 System.out.print(temp.data+"--->");
                 temp=temp.next;
            }
         System.out.print(temp.data);
         }
         else
         System.out.print("Stack underflow");
     }
     
     int pop()
     {
         if(start==null)
         {
         System.out.println("Stack underflow");
         return -1;
        }
         int dat=start.data;
         start=start.next;
         return dat;
     }
}
