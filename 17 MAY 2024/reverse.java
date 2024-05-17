
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        int temp=num;
        int reminder;
        int sum=0;
        while(temp>0)
        {
            reminder=temp%10;
            sum=(sum*10)+ reminder;
            temp=temp/10;
        }
        System.out.println(sum);

    }
}
