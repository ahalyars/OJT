//14 Two Sum III Data structure design
import java.util.HashMap;

public class solution14 {
    private HashMap<Integer, Integer> elements = new HashMap<>();

    public void add(int number) {
        if (elements.containsKey(number)) {
            elements.put(number, elements.get(number) + 1);
        } else {
            elements.put(number, 1);
        }
    }

    public boolean find(int value) {
        for (Integer i : elements.keySet()) {
            int target = value - i;
            if (elements.containsKey(target)) {
                if (i == target && elements.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solution14 twoSum = new solution14();

        // Adding numbers to the TwoSum object
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);

        // Testing the find method
        int target1 = 4;
        System.out.println("Does TwoSum have two numbers that sum up to " + target1 + "? " + twoSum.find(target1));

        int target2 = 7;
        System.out.println("Does TwoSum have two numbers that sum up to " + target2 + "? " + twoSum.find(target2));

        int target3 = 8;
        System.out.println("Does TwoSum have two numbers that sum up to " + target3 + "? " + twoSum.find(target3));

        int target4 = 10;
        System.out.println("Does TwoSum have two numbers that sum up to " + target4 + "? " + twoSum.find(target4));
    }
}
