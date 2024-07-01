
// Node class definition
class Node {
    int value;
    int min;
    Node next;

    Node(int x) {
        value = x;
        next = null;
        min = x; // Initially, min is set to the value of the node
    }
}

// MinStack class definition
public class question45 {
    Node head;

    public void push(int x) {
        if (head == null) {
            head = new Node(x);
        } else {
            Node temp = new Node(x);
            temp.min = Math.min(head.min, x);
            temp.next = head;
            head = temp;
        }
    }

    public void pop() {
        if (head == null)
            return;
        head = head.next;
    }

    public int top() {
        if (head == null)
            return Integer.MAX_VALUE; // Assuming stack is empty case
        return head.value;
    }

    public int getMin() {
        if (head == null)
            return Integer.MAX_VALUE; // Assuming stack is empty case
        return head.min;
    }

    // Main method for testing
    public static void main(String[] args) {
        question45 minStack = new question45();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Current top of stack: " + minStack.top());    // Output: -3
        System.out.println("Current min of stack: " + minStack.getMin());  // Output: -3

        minStack.pop();
        System.out.println("After pop, current top of stack: " + minStack.top());    // Output: 0
        System.out.println("After pop, current min of stack: " + minStack.getMin());  // Output: -2
    }
}
