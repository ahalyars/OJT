import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringConcatenation_38 {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLength; i++) {
            HashMap<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < wordCount) {
                int wordIndex = i + j * wordLength;
                String currentWord = s.substring(wordIndex, wordIndex + wordLength);
                if (wordMap.containsKey(currentWord)) {
                    seen.put(currentWord, seen.getOrDefault(currentWord, 0) + 1);
                    if (seen.get(currentWord) > wordMap.get(currentWord)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
            if (j == wordCount) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words)); // Output: [0, 9]
    }
}
