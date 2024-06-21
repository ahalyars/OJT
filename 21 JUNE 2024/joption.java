import javax.swing.JOptionPane;

public class joption {

    public static void main(String[] args) {
 
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        int num1 = Integer.parseInt(input1);


        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        int num2 = Integer.parseInt(input2);


        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
