class newThread1 extends Thread {
    public void run() {
        int count = 0;
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thanks  1");
                sleep(1000);
                System.out.println(++count);
                System.out.println(getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class newThread2 extends Thread {
    public void run() {
        int count = 0;
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thanks  2");
                sleep(1000);
                System.out.println(++count);
                System.out.println(getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class thread_sleep_classQues {
    public static void main(String[] args) {
        newThread1 t1 = new newThread1();
        t1.start();
        newThread2 t2 = new newThread2();

        t2.start();
    }
}