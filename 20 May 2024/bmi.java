/*Write a Java program that calculates the Body Mass Index (BMI) based on the user&#39;s weight
and height, and categorizes the result:
 BMI &lt; 18.5: Underweight
 18.5 &lt;= BMI &lt; 25: Normal weight
 25 &lt;= BMI &lt; 30: Overweight
 BMI &gt;= 30: Obesity*/
import java.util.Scanner;

public class bmi {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Weight in kl");
        double Weight = s.nextDouble();
        System.out.println("Height in centimeters" );
        double Height = s.nextDouble();
        double HeightinMeter = Height / 100;

        double bmi = Weight/(HeightinMeter*HeightinMeter);
        System.out.println("Your bmi is "+ bmi);
        
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
       else if (bmi >=18 && bmi <25) {
           System.out.println("Normal");
           
       }
       else if(bmi>= 25 && bmi<30){
        System.out.println("Overweight");
       }
       else if(bmi>=30){
        System.out.println("Obesity");
       }
       else{
        System.out.println("invalid");
       }
    }
    }
