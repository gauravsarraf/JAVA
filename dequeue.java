//Question 25
//Write a program to create a Double ended queue, method for insertion and deletion from both ends and a display method.

class dequeue
 {
     int s;
     int dq[]=new int[s];
     int f,r;
     dequeue(int size)
     {
         dq=new int[size];
         f=0;
         r=-1;
     }
     
     void Insert_front(int item)
     {
         if(f==0&&r==-1)
         {
             dq[f++]=item;
             r++;
             return;
         }
         else if(f>0)
         {
             dq[--f]=item;
             return;
         }
         System.out.println("Insertion from front not possible");
     }
     
     void Insert_rear(int item)
     {
         if(r!=(s-1))
         {
             dq[++r]=item;
             return;
         }
         System.out.println("Insertion from rear not possible");
     }
     
     int Delete_front()  
     {
         int temp=dq[f];
         f++;
         return temp;
     }
     
     int Delete_rear()  
     {
         int temp1=dq[r];
         r--;
         return temp1;
     }
     
     void main()
     {
         for(int i=f;i<=r;i++)
         {
             System.out.println(dq[i]+" ");
         }
     }
    }
