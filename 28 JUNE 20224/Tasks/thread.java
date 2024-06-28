class threadss extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println(+i);
        }
        System.out.println("*******");
    }
}
class threads extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println(+i);
        }
       
    }
}
public class thread {
    public static void main(String[] args) {
        threadss t=new threadss();
        threads s=new threads();
        t.start();
        s.start();
    }
    
}