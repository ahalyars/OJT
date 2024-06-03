
import java.util.Scanner;
public class loan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Age :: ");
        int age=s.nextInt();
        System.out.println("Enter your Income :: ");
        double income=s.nextDouble();
         if(age>=18 && age<=25 && income>=2500)
        {
            System.out.println("Eligible for small loan");
        }
        else if(age>=26 && age<35 && income>=50000)
        {
            System.out.println("Eligible for medium loan");
        }
        else if(age>35 && income>=75000)
        {
            System.out.println("Eligible for large loan");
        }
        else
        {
            System.out.println("Not eligible for Loan");
        }
    }
}
