import java.util.ArrayList;
public class for_each {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pinapple");
        for(String fruit_S : fruits)
        {
            System.out.println(fruit_S);
        }

    }
}
