public class threads extends Thread {
    public static void main(String[] args) {
        threads thread = new threads();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
  