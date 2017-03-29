//Question 22

class Point
{
    int x;
    int y;
    public Point()
    {
        this.x = 0;
        this.y = 0;

    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public double distance(int x, int y) 
    {
        double d = Math.sqrt( Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2) );
        return d;
    }
}    
