import java.util.*;
public class hashmapex {
    public static void main(String[] args) {
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1, "Ahalya");
        m1.put(2, "Aparna");
        m1.put(3,"Ammu");
        m1.put(4,"malu");
        System.out.println("Value at key 1 : "+m1.get(1));
        System.out.println("_______________________");
        for(Integer key:m1.keySet())
        {
            System.out.println("Key : "+key+" Value : "+m1.get(key));
        }
        m1.replace(4,"ammalu");
        System.out.println("_______________________");
        for(Integer key:m1.keySet())
        {
            System.out.println("Key : "+key+" Value : "+m1.get(key));
            }

}
}
