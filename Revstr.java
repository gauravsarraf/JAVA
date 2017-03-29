//Question 9
//Write a program to input a string, reverse it using recursive technique and check if it’s a palindrome.

import java.util.*;
class Revstr
{ 
    Scanner s=new Scanner(System.in);
    String str="",revstr="";
    int l;
    char ch;
    void getStr()
    {
        str=s.nextLine();
        l=((str.length())-1);
    }
    void recReverse(int len)
    {
        
        if(len>=0)
        {
           ch=str.charAt(len);
           revstr=revstr+ch;
           len--;
           recReverse(len);
        }
    }
    
    void Check()
    {
        System.out.println("Original: "+str);
        recReverse(l);
        System.out.println("Reverse: "+revstr);
        if(revstr.equals(str))
        System.out.println("is Palindrome");
        else
        System.out.println("is not Palindrome");
    }
    void main()
    {
        System.out.println("Enter a string");
        getStr();
        Check();
    }
}
