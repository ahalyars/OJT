interface shape
{
    double perimeter();
}

class rectangle implements shape
{
    private double length;
    private double width;
    public rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double perimeter()
    {
        return (length+width)*2;
    }
}
public class peri {
    public static void main(String[] args) {
      rectangle r=new rectangle(10,5);
        System.out.println("Perimeter of rectangle is "+r.perimeter());

    
}
}