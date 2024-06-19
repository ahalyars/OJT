public class params
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double  a,double  b)
    {
        return  a+b;
    }
    int add(int x,int y,int z)
    {
        return  x+y+z;
    }
    public static void main(String[] args) {
        params calc=new params();
        System.out.println("Add two Integers: "+calc.add(10,20));
        System.out.println("Addtwo Doubles: "+calc.add(5.6,25.2));
        System.out.println("Add three Integers: "+calc.add(10,20,30));
        
    }
}