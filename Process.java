//Question 26
//Write a program creating a super class Data and a subclass Process to print and count the words beginning with a vowel in a string.

import java.util.*;
class Process extends Data
{
    int len=str.length();
    void vowelWords()
    {
        String str1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentance");
        acceptstr(sc.nextLine());
        print();
        str=str;
        StringTokenizer s=new StringTokenizer(str," ");
        char ch;
        int ctr=0;
        while(s.hasMoreTokens())
        {
            str1=s.nextToken();
            ch=str1.charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.print(str1+" ");
                ctr++;
            }
        }
        System.out.println();
        System.out.println("Number of words starting with a vowel: "+ctr);
    }
}