//Write a Java program that takes a person&#39;s age as input and determines if they are
//eligible to vote (age 18 or older).


import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=s.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for vote");
        }
        else
        {
            System.out.println("You are Not eligible for vote");
        }

    }
}
