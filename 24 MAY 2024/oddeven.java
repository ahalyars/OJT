import java.util.Scanner;
public class oddeven{
    public static void main(String[]args){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=Scanner.nextInt();
        if (num%2==0)
        {
            System.out.println(num+" "+" is a even number");
        }
        else{
            System.out.println(num+" "+" is a odd  number");
        }
    }
}
