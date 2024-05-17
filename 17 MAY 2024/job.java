
import java.util.Scanner;

public class job {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("sex(m/f)");
        String sex=s.nextLine();
        System.out.println("Enter your age");
        int age=s.nextInt();

        if(sex.equals("f") || sex.equals("F"))
        {
            System.out.print("You will work only URBAN areas");
        }
        else if(sex.equals("m") || sex.equals("M"))
        {
            if(age>=20 && age<=40)
            {
                System.out.println("Work in Any where");
            }
            else if(age>=40 && age<=60)
            {
                System.out.println("Work in URBAN areas");
            }
            else
            {
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
