abstract class animal
{
    public abstract  void animalsound();
    public void sleep()
    {
        System.out.println("The sleeping sound : Zzz");
    }
}
class Dog extends animal
{
    public void animalsound()
    {
        System.err.println("The Dog says : bow");
    }
}
public class abstac {
    public static void main(String[] args) {
        Dog myDog=new Dog();
        myDog.animalsound();
        myDog.sleep();
    }
}
