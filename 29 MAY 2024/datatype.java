import java.util.*;
public class datatype{
    public static void main(String[] args) {
        int num1;
        float num2;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit :");
        num1=sc.nextInt();
        System.out.println("Digit entered: " + num1);
        System.out.println("Enter a decimal number :");
        num2=sc.nextFloat();
        System.out.println("Decimal number entered: " + num2);
        sc.nextLine(); 
        System.out.println("Enter a String :");
        str=sc.nextLine();
        System.out.println("String entered: " + str);
    }
}