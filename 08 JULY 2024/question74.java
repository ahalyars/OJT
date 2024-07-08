import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class question74 {

    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strings) {
            char[] arr = s.toCharArray();
            if (arr.length > 0) {
                int diff = arr[0] - 'a';
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (char) ((arr[i] - diff + 26) % 26 + 'a');
                }
            }
            String ns = new String(arr);
            if (!map.containsKey(ns)) {
                map.put(ns, new ArrayList<>());
            }
            map.get(ns).add(s);
        }

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            Collections.sort(entry.getValue());
            result.add(entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        question74 solution = new question74();
        String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

        List<List<String>> result = solution.groupStrings(strings);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
