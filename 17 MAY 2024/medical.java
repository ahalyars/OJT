
import java.util.Scanner;

public class medical {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Do you have any medical issues (y/n)?");
    String medicalcause=s.nextLine();
    if(medicalcause.equals("y"))
    {
        System.out.println("Take Rest");
    }
    else{
        System.out.println("Came to Class");
    }
    }
}
