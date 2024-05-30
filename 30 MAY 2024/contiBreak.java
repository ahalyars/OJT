import java.util.Scanner;

public class contiBreak {
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int sum=0;
     
     for(int i=0;i<10;i++)
     {
     int x=s.nextInt();
        if(x<0)
        {
            continue;
            
        }
        else if(x==0){
            break;
            
        }
        else
        {
            System.out.println(sum+=x);
        }
        
     }
    }
}

