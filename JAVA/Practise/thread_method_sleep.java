class newThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thanks  1");
        }
    }
}

class newThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thanks 2");
        }
    }
}

public class thread_method_sleep {
    public static void main(String[] args) {
        newThread1 t1 = new newThread1();
        t1.start();
        newThread2 t2 = new newThread2();

        try {
            Thread.sleep(5000); // dusre thread ko 5000 miliseconds baad chlaega.
            // Used to put a thread to sleep for a specified amount of time.
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}