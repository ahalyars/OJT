class runnable implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
    System.out.println("This is my child Thread");
}
}
public static void main(String[] args) {
    runnable r=new runnable();
    Thread t=new Thread(r);
    t.start();
    for(int i=1;i<=5;i++)
    {
        System.out.println("This is my main Thread");
    }
}
}

 