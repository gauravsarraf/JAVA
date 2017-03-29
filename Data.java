//Question 26

class Data
{
    protected String str;
    Data()
    {
        str=" ";
    }
    void acceptstr(String st)
    {
        str=st;
    }
    void print()
    {
        System.out.println("String: "+str);
    }
}