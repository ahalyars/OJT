import java.util.ArrayList;
public class arr_list {
    public static void main(String[] args) {
        ArrayList<String> car=new ArrayList<>();
        car.add("BMW");
        car.add("Volvo");
        car.add("i10");
        
        System.out.println(car);
        System.out.println(car.size());
        System.out.println(car.get(1));
        System.out.println(car.set(1,"Thar"));
        System.out.println(car.remove(1));
           }
}
