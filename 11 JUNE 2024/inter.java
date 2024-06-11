interface shape
{
    double calarea();
}

class square implements shape
{
    private double length;
    public square(double length)
    {
        this.length=length;
    }
    public double calarea()
    {
        return length*length;
    }
}
public class inter {
    public static void main(String[] args) {
       square r=new square(10);
        System.out.println("Perimeter of rectangle is "+r.calarea());

    
}
}