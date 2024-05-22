class vegetables
{
    public void veg()
    {
        System.err.println("The Vegetables");
    }
}
class carrot extends vegetables{
    //public String name="carrot";
    public void taste()
    {
        System.out.println("It is very tasty");
    }
}
class tomato extends carrot
{
    public void sweet()
    {
        System.out.println("It is very sweet");
    }
}


public class inheri {
    public static void main(String[] args) {
         carrot myCarrot=new carrot();
         tomato myTomato=new tomato();
         myCarrot.veg();
         myTomato.sweet();
         myTomato.veg();
         //System.err.println("name:" +myTomato.name);

    }
}
