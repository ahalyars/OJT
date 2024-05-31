import java.time.LocalDate;
import  java.util.Scanner;

public class parse {
    public static void main(String[] args) {
      Scanner lc=new Scanner(System.in) ;
      System.out.println("Enter a date");
      String date=lc.nextLine();//yyyy-mm-dd
      LocalDate date1=LocalDate.parse(date);
      System.out.println(date1);
      boolean leap=date1.isLeapYear();
      System.out.println("Leap yr ??" +leap);

    }
}
