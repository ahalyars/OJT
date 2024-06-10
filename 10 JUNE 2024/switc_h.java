// Write a Java program using switch-case that performs basic arithmetic operations 
// (addition, subtraction, multiplication, division) based on user input.  
import  java.util.Scanner;
public class switc_h
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Operator(+,-,*,/) : ");
        String operator=s.nextLine();

        System.out.print("Enter the Fistr num : ");
        int num1=s.nextInt();
       
        System.out.println("Enter the second number : ");
        int num2=s.nextInt();

        
       

        switch(operator)
        {
        
            case "+":
            System.out.println("num1 + num2 = "+(num1+num2));
            break;
            case "-" :
            System.out.println("num1 - num2 = "+(num1-num2));
            break;
            case "*":
            System.out.println("num1 * num2 = "+(num1*num2));
            case "/":
            System.out.println("num1 / num2 = "+(num1/num2));
            default:
            System.out.println("select the proper operator");
            break;

        }
       
    }
    }


