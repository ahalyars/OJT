package ExceptionHandling;
import java.util.Scanner;

class MycustomEception extends Exception
{
    public  MycustomEception(String msg){
        super(msg);
    }
}
public class exception2 {
    public static void  accept(int mark)throws MycustomEception {
        if(mark>100 && mark!=0){
            throw new  MycustomEception("Total should not be morethan 100 or lessthan 0"); 
        }
        else if(mark>70){
            System.out.println("good");
        }
        else if(mark>50){
            System.out.println("average");
        }
        else{
            System.out.println("fail");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the total marks:");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        try{
            accept(mark);
            }
            catch(MycustomEception e){
                System.out.println(e);
            }
    }
    
}
