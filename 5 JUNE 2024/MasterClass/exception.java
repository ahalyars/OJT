import java.util.*;
class program6{
    int num1,num2,res;
    public void calculate(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two values for num1 and num2 ");
    num1=sc.nextInt();
    num2=sc.nextInt();
    res =num1/num2;
    System.out.println("The result is "+res);
}
}
public class exception {
    public static void main(String[] args) {
        program6 myobj =new program6();
        myobj.calculate();
    }
}
