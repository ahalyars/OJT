import java.util.Scanner;
class Ans{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the length");
    int x=s.nextInt();
    System.out.println("Enter the Width");
    int y=s.nextInt();
    if(x==y)
    {
        System.out.println("Square");
    }
    else{
        System.out.println("Rectangle");
    }
}
}