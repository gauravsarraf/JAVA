//Question 5
//Write a program to input a number and print its equivalent roman numeral.

import java.util.*;
class RomanNumbers
{
    public static void main()
    {
    Scanner s=new Scanner(System.in);
    String num;
    int l=0,sum=0;
    char ch;
    System.out.println("Enter a roman number");
    num=s.nextLine();
    l=num.length();
    for(int i=0;i<l;i++)
    {
        ch=num.charAt(i);
        switch(ch)
        {
            case 'M' : sum=sum+1000;
            break;
            case 'D' : sum=sum+500;
            break;
            case 'C' : sum=sum+100;
            break;
            case 'L' : sum=sum+50;
            break;
            case 'X' : sum=sum+10;
            break;
            case 'V' : sum=sum+5;
            break;
            case 'I' : sum=sum+1;
            break;
            default :
            System.out.println("Invalid input");
        }
    }
    System.out.println(sum);
    }
}
