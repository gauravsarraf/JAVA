//Question 13
//Write a program to count the number of vowels in a string using recursive technique. 

import java.util.*;
class Check
{ 
    Scanner s=new Scanner(System.in);
    String str;
    int l;
    int w=0;
    void InputString()
    {
        System.out.println("Enter a string");
        str=" "+s.nextLine();
        l=str.length()-1;
    }
    void Counter()
    {
        if(l>=0)
        {
            char ch=str.charAt(l);
            if(ch==' ')
            {
                char ch1=str.charAt(l+1);
                if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
                {
                    w++;
                }
            }
            l--;
            Counter();
        }
    }
    void Disp()
    {
        InputString();
        Counter();
        System.out.println("number of words beginning with a captial vowel : "+w);
    }
}
