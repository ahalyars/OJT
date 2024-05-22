class Animal
{
    public void  animalSound()
    {
        System.out.println("Animal make sound");
    }
}
class pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig sound is : wee wee");
    }
}
class dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig sound is : bow bow");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        pig myPig=new pig();
        dog myDog=new dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();



    }
}
