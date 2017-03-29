//Question 7
//Write a program to compute the fine for returning a book late to a library. Show the implementation of Inheritance. 

public class Library 
{
    static String name,author;
    static double p;
    Library(String n,String a, double np)
    {
        name=n;
        author=a;
        p=np;
    }
    
    void show()
    {
        System.out.println(name+" by "+author+" costs "+p);
    }
}

class Compute extends Library
{
    int d;
    double r;
    Compute(String n,String a, double np,int dd)
    {
        super(n,a,np);
        d=dd;
        r=0.0;
    }
    
    void fine()
    {
        if(d>7&&d<12)
        r=2*d;
        else if(d>12&&d<17)
        r=3*d;
        else if(d>=17)
        r=5*d;
    }
    
    void display()
    {
        show();
        fine();
        System.out.print("Number of excess days: "+(d-7)+" Total amount to be paid: "+((((2/100)*p)*(d-7))+r)+".");
    }
}        
