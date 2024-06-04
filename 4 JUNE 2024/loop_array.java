
import java.util.ArrayList;
public class loop_array {
    public static void main(String[] args) {
        ArrayList<String> car=new ArrayList<>();
        car.add("Volvo");
        car.add("BMW");
        for(int i=0; i<car.size();i++)
        {
            System.out.println(car.get(i));
        }
    }
}
