class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is Starting..." + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread is not Starting.. " + e);
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}