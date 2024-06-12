class car{
    public static String color;
    public static String model;
    void display(){
        System.out.println("Model :"+ model +" color :"+color);
    }
}
public class classex{
    public static void main(String[] args) {
        car obj = new car();
        car.color ="red";
        car.model="Toyoto";
        obj.display();
    }
}