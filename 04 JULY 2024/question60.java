public class question60 {
        public String countAndSay(int n) {
            if (n <= 0) {
                return "";
            }            
            String result = "1";
            for (int i = 1; i < n; i++) {
                StringBuilder next = new StringBuilder();
                int count = 1;
                for (int j = 1; j < result.length(); j++) {
                    if (result.charAt(j) == result.charAt(j - 1)) {
                        count++;
                    } else {
                        next.append(count);
                        next.append(result.charAt(j - 1));
                        count = 1;
                    }
                } 
                next.append(count);
                next.append(result.charAt(result.length() - 1));
                
                result = next.toString();
            }
            return result;
        }
        public static void main(String[] args) {
            question60  solution = new  question60 ();
            int n = 5;
            System.out.println(solution.countAndSay(n)); // Output should be "111221"
        }
    }
    

