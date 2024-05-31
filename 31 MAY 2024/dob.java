import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class dob {
    public static void main(String[] args) {
        Scanner lc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=lc.nextLine();
        System.out.println("Enter your DOB");
        LocalDate date=LocalDate.parse(lc.nextLine());
        LocalDate currenDate=LocalDate.now();
        Period bday=Period.between(date,currenDate);
        System.out.println("My name "+name+" DOB is "+bday.getYears());

    }
}
