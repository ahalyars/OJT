import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> fruits=new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.addFirst("Strawberry");
        fruits.addLast("Mango");
        // fruits.removeFirst();
        // fruits.removeLast();
        // fruits.getFirst();
        // fruits.getLast();
        for(String fruit_S:fruits)
        {
            System.out.println(fruit_S);
        }
       
    }    
}
