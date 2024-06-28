class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread 1 is running");
        for(int i=1;i<=5;i++){
       
            System.out.println(i);
        }
    }
    }
    class MyThread1 implements Runnable{
        
        public void run(){
            System.out.println("Thread 2 is running");
    
        for(int i=1;i<=5;i++){
             System.out.println(i);
        }
    }
    }
    class MyThread2{
    public static void main(String args[]){
    MyThread t1=new MyThread();
    MyThread1 t2=new MyThread1();
    Thread th1=new Thread(t1);
    Thread th2=new Thread(t2);
    th1.start();
    th2.start();
    }
    }