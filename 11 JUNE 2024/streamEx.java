import java.util.*;
import java.util.stream.Collectors;
public class streamEx {
    public static void main(String[] args) {
        //filter
        List<String> names = Arrays.asList("Summer","Monsoon","Autumn","Spring","winter");
       
        List<String>fnames = names.stream().filter(name->name.startsWith("S")).collect(Collectors.toList());

        System.out.println("Filterned names are:"+fnames);
        //sorting
        List<String>snames=names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted names: "+snames);
        //mapping
        Map<Integer,List<String>> mobj = names.stream().collect(Collectors.groupingBy(String::length));
        
        System.out.println("Mapping values:"+mobj);
    }
}
