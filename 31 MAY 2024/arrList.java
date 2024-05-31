import java.util.ArrayList;
public class arrList
{
public static void main(String[] args) {
    ArrayList<String> fruits=new ArrayList<String>();
    fruits.add("mango");
    fruits.add("Orange");
    System.out.println(fruits);
    fruits.remove("mango");
    fruits.get(0);
    System.out.println(fruits.size());
    fruits.set(0, "apple");
    for(String fruit:fruits){
        System.out.print(fruit+" ");
    }
   
}
}