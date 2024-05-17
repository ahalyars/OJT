
import java.util.Scanner;

public class leapyr {
    public static void main(String[] args) {
        Scanner yr=new Scanner(System.in);
        System.out.println("Enter the yr = ");
        int x=yr.nextInt();
        if((x%4 == 0) || (x%100 ==0 && x%400==0))
        {
            System.err.println("LEAP YR");
        }
        else
        {
            System.err.println("Not a LEAP YR");
        }
    }
}
