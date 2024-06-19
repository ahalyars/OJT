public class calculator
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return  a+b;
    }
    public static void main(String[] args) {
        calculator calc=new calculator();
        System.out.println("Add two Integers: "+calc.add(10,20));
        System.out.println("Addtwo Doubles: "+calc.add(5.6,25.2));
    }
}