class Livingbeing{
  void intro(){
      System.out.println("I am LivingBeing");
  }
}
class Animal extends  Livingbeing{
  void intro1(){
      System.out.println("I am an Animal");
  }
}
class Dog extends  Animal{
  void intro2(){
      System.out.println("I am a dog");
  }
}
public class excercise2 {
  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.intro();
      dog.intro1();
      dog.intro2();
  }
  
}
