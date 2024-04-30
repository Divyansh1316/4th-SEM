class newThread1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                System.out.println("Thanks  1");
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
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

public class thread_method_interrupt {
    public static void main(String[] args) {
        newThread1 t1 = new newThread1();
        t1.start();
        newThread2 t2 = new newThread2();

        t1.interrupt();
        t2.start();
    }
}