interface shape
{
    double calarea();
}
class rectangle implements shape
{
    private double length;
    private double width;
    public rectangle(double l,double w)
    {
        this.length=l;
        this.width=w;
    }
    public double calarea()
    {
        return length*width;
    }
}
public class interfacess {
    public static void main(String[] args) {
        rectangle r=new rectangle(10,5);
        System.out.println("Area of rectangle is "+r.calarea());

    
}
}