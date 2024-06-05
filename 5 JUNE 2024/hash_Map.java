import java.util.HashMap;
public class hash_Map {
    public static void main(String[] args) {
        HashMap<String,String> places=new HashMap<>();
        places.put("Tvm", "Attingal");
        places.put("Klm", "kottiyam");
        System.out.println(places);
        System.out.println(places.get("Tvm"));
        System.out.println(places.remove("Klm"));
        System.out.println(places.size());
        System.out.println(places);
    }
}
