import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class employee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name :");
        String name = sc.nextLine();
        System.out.println("Enter joining Date");
        LocalDate joiningDate = LocalDate.parse(sc.nextLine());
        // Create a LocalDate object for the date of birth
        

        // Create a LocalDate object for the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age in years, months, and days
        Period experience = Period.between(joiningDate, currentDate);

        // Print the age
        System.out.println("Name : "+name );
        System.out.println("Expeience : " + experience.getYears() +"Years");
    }
}
