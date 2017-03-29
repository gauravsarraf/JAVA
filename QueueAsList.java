//Question 27
//Write a program to create a linked list implemented as a queue, insert, delete and display elements in it.

public class QueueAsList
{
     int data;
     QueueAsList temp, link, front, rear;
     QueueAsList()
     {
         data=0;
         temp=link=front=rear=null;
     }
     
     void insert(int item)
     {
         QueueAsList temp=new QueueAsList();
         temp.data=item;
         temp.link=null;
         if(front==null&&rear==null)
         {
             front=rear=temp;
         }
         else
         {
             rear.link=temp;
             rear=temp;
         }
     }
     
     void display()
     {
         QueueAsList temp=new QueueAsList();
         temp=front;
         if(temp!=null)
         {
             while(temp.link!=null)
             {
                 System.out.print(temp.data+"--->");
                 temp=temp.link;
             }
         System.out.print(temp.data);
         }
         else
         System.out.print("Queue underflow");
     }
     int delete()
     {
         if(front==null)
         {
         System.out.println("Queue underflow");
         return -1;
         }
         int dat=front.data;
         front=front.link;
         return dat;
    }
}
