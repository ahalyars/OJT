import java.util.Scanner;
class greater
{
    public static void main(String[] args) {
        Scanner s =new  Scanner(System.in);
        System.out.println("Enter the first  number");
        int x=s.nextInt();
        System.out.println("Enter the second number");
        int y=s.nextInt();
        if(x>y)
        {
            System.out.println("X is Big number");
        }
        else
        {
            System.out.println("Y is Big number");
        }
    }
}