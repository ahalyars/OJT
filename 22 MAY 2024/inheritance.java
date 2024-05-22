class Animal{
    public void eat()
    {
        System.err.println("Animal is eating");
    }
}
class Dog extends Animal{
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}
class cat extends Dog
{
    public void sound()
    {
        System.out.println("meow meow");
    }
}
public class inheritance {    
    public static void main(String[] args) {
        Dog mydog=new Dog();
        cat mycat=new cat();
        mydog.eat();
        mydog.bark();
        mycat.sound();
    }
}
