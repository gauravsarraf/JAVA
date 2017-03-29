//Question 14
//Write a program to find the factorial of a given number using recursion technique.	
class factorial
 {
     int n, f;
     factorial()
     {
         n=0;
         f=1;
     }
     
     public int fact(int num)
     {
        if(num==0)
        return 1;
        else
        return fact(num-1)*num;
     }
     
     void getnumber(int x)
     {
         n=x;
         f=fact(n);
         System.out.println("Factorial of "+x+" is "+f);
     }
     
     public static void main(int n1)
     {
         factorial f1=new factorial();
         f1.getnumber(n1);
        }
    }
