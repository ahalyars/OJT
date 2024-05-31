import java.time.LocalDate;
public class localDate {
    public static void main(String[] args) {
        LocalDate currDate=LocalDate.now();
            System.out.println("Today Date : "+currDate);
        LocalDate tommaDate=currDate.plusDays(1);
            System.out.println("Tomarrow Date : "+tommaDate);
        LocalDate yesDate=currDate.minusDays(1);
        System.out.println("Yesterday Date : "+yesDate);
        boolean leap=currDate.isLeapYear();
        System.out.println(leap);
    }
}
