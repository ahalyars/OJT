// Write a Java program that checks if a user can log in based on a predefined username and password. 
// Use if-else statements to validate the credentials and print appropriate messages.
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
       String userName="Ahalya";
       String passWord="Ahalya@123";

       Scanner s=new Scanner(System.in);
       System.out.print("Enter Your username : ");
       String name=s.nextLine();
       System.out.println("Enter your password : ");
       String passkey=s.nextLine();

        if(userName.equals(name) && passWord.equals(passkey))
        {
            System.out.println("Successfully joined");
        }
        else{
            System.out.println("Plz login");
        }
    }
    
}
