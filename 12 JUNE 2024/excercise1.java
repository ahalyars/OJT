
class vehicle {

    void displayType() {
        System.out.println("Type :car");
    }
}

class car extends vehicle {

    void displayBrand(String brand) {
        System.out.println("Brand :" + brand);
    }
}

public class excercise1 {

    public static void main(String[] args) {
        car obj = new car();
        obj.displayType();
        obj.displayBrand("BMW");
    }
}
