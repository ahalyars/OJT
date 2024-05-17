import java.util.Scanner;
public class attendence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int TotalClass=25;
        System.out.println("Enter the Your total Class : ");
        int classes = s.nextInt();
        double attendence = ((double)classes/TotalClass)*100;
        System.out.println(attendence);
        if(attendence>=75)
        {
            System.out.println("Eligible for exam");
        }
        else
        {
            System.out.println("Not Eligible");
        }


    }
}
