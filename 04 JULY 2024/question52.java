//Simplify path
import java.util.Stack;
import java.util.LinkedList;

public class question52 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        // Split the path by '/' and process each part
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.equals(".") && !part.isEmpty()) {
                stack.push(part);
            }
        }

        // Construct the simplified path
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/");
            sb.append(dir);
        }

        // Return the simplified path or root if stack is empty
        return sb.length() > 0 ? sb.toString() : "/";
    }

    public static void main(String[] args) {
        question52 sol = new question52();
        String path = "/home//foo/";
        System.out.println(sol.simplifyPath(path)); // Output should be "/home/foo"
    }
}

    

