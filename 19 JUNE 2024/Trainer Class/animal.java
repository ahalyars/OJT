class Animals{
    void makesound(){
        System.out.println("the animal makes sound");
    }
}
class dog extends Animals{
    @Override
    void makesound(){
        System.out.println("Dog : bow bow");
    }
}
class cat extends Animals{
    @Override
    void makesound(){
        System.out.println("cat : meow");
    }
}
class cow extends Animals{
    @Override
    void makesound(){
        System.out.println("cow : bewwww");
    }
}
public class animal {
    public static void main(String[] args) {
        Animals[] animal = new Animals[4];
        animal[0]=new Animals();
        animal[1]=new dog();
        animal[2]=new cat();
        animal[3]=new cow();
        for(Animals a:animal){
            a.makesound();
            }
            }
        }
//         Animals dogs = new dog();
//         Animals cats = new cat();
//         Animals cows = new cow();
//         animal.makesound();
//         dogs.makesound();
//         cats.makesound();
//         cows.makesound();
