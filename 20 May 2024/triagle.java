import java.util.Scanner;

public class triagle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("x size : ");
        int x=s.nextInt();
        System.out.println("y size : ");
        int y=s.nextInt();
        System.out.println("z size : ");
        int z=s.nextInt();
        int sum=x+y+z;
        if(sum==180)
        {
            System.out.println("Is a Valid Triangle");
        }
        else
        {
            System.out.println("Is Not a valid Triangle");
        }
}
}
