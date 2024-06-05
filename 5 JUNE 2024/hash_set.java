import java.util.HashSet;
public class hash_set {
    public static void main(String[] args) {
        HashSet<String> fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.remove("Apple");
        System.out.println(fruits);
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.contains("pinapple"));
        System.out.println(fruits.remove("Mango"));
        System.out.println(fruits);
    }
}
