abstract  class car{
    car()
    {
        System.out.println("Owner is John");
    }
    abstract void carBrand();
    public void color()
    {
        System.out.println("Color is Black");
    }
}
class car1 extends car{
    public void carBrand()
    {
        System.out.println("Brand is toyoto");;
    }
}
class car2 extends car {
    public void carBrand()
    {
        System.out.println("Brand is honda");
    }
}


public class abstraction {
    public static void main(String[] args)
    { 
         car mycar=new car1();
        mycar.carBrand();
        mycar.color();
        }
  
        };

