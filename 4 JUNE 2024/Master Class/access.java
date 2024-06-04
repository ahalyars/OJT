
class sample
{
    public int x=100;
    private int y=200;
    private static int z=50;
    private static void increment()
    {
        z++;
    }

    void show()
    {
System.out.println("The value of x : "+x);
System.out.println("The value of y : "+y);
sample.increment();
System.out.println("The value of y : "+z);
    }
}
public class access {
    public static void main(String[] args) {
        sample obj=new sample();
        
        obj.show();
        
    }
    
}
