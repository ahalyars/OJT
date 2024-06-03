import java.util.Scanner;

public class if_else_check {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x=num.nextInt();
        if(x>0)
        {
            System.out.println("The number is +ve");
        }
        else
        {
            System.out.println("The number is -ve");
        }
    }
}
