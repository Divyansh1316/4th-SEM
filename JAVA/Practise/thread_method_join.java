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

public class thread_method_join {
    public static void main(String[] args) {
        newThread1 t1 = new newThread1();
        t1.start();
        newThread2 t2 = new newThread2();

        try {
            t1.join(); // jb tk t1 finish nhi ho jata, tb tk t2 nhi chlega
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}