import java.util.*;
public class ArrayListex {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        l1.add("HTML");
        l1.add("CSS");
        l1.add("Java");
        l1.add("Python");

        System.out.println("Element at index number 2 : "+l1.get(2));
        System.out.println("______________________________");
        for(String cource:l1)
        {
            System.out.println(cource);
        }
        System.out.println("______________________________");
        System.out.println(l1);
        System.out.println("______________________________");
       
        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
}
}