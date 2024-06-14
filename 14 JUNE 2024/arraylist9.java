import java.util.ArrayList;

public class arraylist9 { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    System.out.println(cars);
    cars.remove("BMW");
    System.out.println(cars);
    System.out.println(cars.size());
  } 
}
