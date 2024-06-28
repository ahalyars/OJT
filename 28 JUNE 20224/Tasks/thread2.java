class thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            
            try {
                System.out.println("NSTI");
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread was a interupted : "+e.getMessage());
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        thread2 t1=new thread2();
        t1.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("                   ADIT");
            Thread.sleep(500);
        }
    }
}

