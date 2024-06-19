class Animal{
    void makesound(){
        System.out.println("the animal makes sound");
    }
}
class pig extends Animal{
    @Override
    void makesound(){
        System.out.println("pig : Wee Wee");
    }
}
class cat extends Animal{
    @Override
    void makesound(){
        System.out.println("cat : meow");
    }
}
public class overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal pigs = new pig();
        animal.makesound();
        pigs.makesound();
        Animal cats = new cat();
        cats.makesound();
    }
}