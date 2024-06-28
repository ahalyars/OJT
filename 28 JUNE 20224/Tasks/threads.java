public class threads extends Thread {
    private String threadName;

    threads(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ":" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args) {
        threads t1 = new threads("Thread 1");
        threads t2 = new threads("Thread 2");
        t1.start();
        t2.start();

    }
}


 