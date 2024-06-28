
class thread1 extends Thread
{
    public void run()
    {
       for(int i=1;i<=5;i++)
       {
        System.out.println("NSTI");
       }
    }
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Wow...");
        }
    }
}
