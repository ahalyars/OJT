class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}


class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class polymor {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myDog.animalSound();
  }
}
