class animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends animal
{
    void bark()
    {
        System.out.println("BoW BoW");
    }
}
public class inheritance {
 public static void main(String[] args) {
     Dog myDog=new Dog();
     myDog.eat();
     myDog.bark();
 }   
}
