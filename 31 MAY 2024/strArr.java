import java.util.Scanner;
public class strArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String numString =sc.nextLine();//"1,2,3"
        
        String[] numberasString=numString.split(",");//{"1","2","3"}
        int[] numbers = new int[numberasString.length];//{ , , }
        for (int i = 0; i < numberasString.length; i++) {
            numbers[i] = Integer.parseInt(numberasString[i].trim()); //[1,2,3]
        }
        System.out.println("Array of numbers ");
        
        for (int number : numbers){
            System.out.print(number+",");
        }

        
    }}