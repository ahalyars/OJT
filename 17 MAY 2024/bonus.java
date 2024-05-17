import java.util.Scanner;

public class bonus {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the experience: ");
        int experience = s.nextInt();
        System.out.println("Enter the salary: ");
        int salary = s.nextInt();
        
        if(experience>5){
            int bonus = (salary*5)/100;
            System.out.println("Your bonus amount is : "+bonus+ " And your Salary is : "+ (salary+bonus) );
        }
        else{
            System.out.println("Your Salary is : "+salary+" Only");
        }
    }
}