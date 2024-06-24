
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class WordNode {
    String word;
    int numSteps;

    public WordNode(String word, int numSteps) {
        this.word = word;
        this.numSteps = numSteps;
    }
}

public class quesion4 {

    public static int ladderLength(String beginWord, String endWord, List<String> dict) {
        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginWord, 1));
        Set<String> wordSet = new HashSet<>(dict);
        wordSet.add(endWord);

        while (!queue.isEmpty()) {
            WordNode top = queue.remove();
            String word = top.word;

            if (word.equals(endWord)) {
                return top.numSteps;
            }

            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];
                    if (arr[i] != c) {
                        arr[i] = c;
                    }
                    String newWord = new String(arr);
                    if (wordSet.contains(newWord)) {
                        queue.add(new WordNode(newWord, top.numSteps + 1));
                        wordSet.remove(newWord);
                    }
                    arr[i] = temp;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> dict = Arrays.asList("hot", "dot", "dog", "lot", "log");

        int length = ladderLength(beginWord, endWord, dict);
        System.out.println("Length of shortest transformation sequence: " + length);
    }
}
