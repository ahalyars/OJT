// public class threeNum
// {
//     public static void main(String[] args) {
//         int a=5,b=8,c=3;
//         if(a>b && a>c)
//         {
//             System.out.println("A is elder");
//         }
//         else if(b>a && b>c)
//         {
//             System.out.println("B is elder");
//         }
//         else
//         {
//             System.out.println("C is elder");
//         }
//     }
// }


import java.util.Scanner;
public class threeNum
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age of A");
        int a=s.nextInt();
        System.out.println("Enter the age of B");
        int b=s.nextInt();
        System.out.println("Enter the age of c");
        int c=s.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A is elder");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is elder");
        }
        else
        {
            System.out.println("C is elder");
        }
    }
}