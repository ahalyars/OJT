import java.util.Scanner;
public class purchase
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  th e Quantity : ");
        int quantity=s.nextInt();
        int total=quantity*100;
        if(total>1000)
        {
            int discount=(total*10)/100;
            System.err.println("Your discount amount is : "+discount+" amount is : "+(total-discount));
        }
        else{
            System.out.println("Your amount is : "+total);
        }
    }
}