//thread implementation using runnable interface
//output will not be synchronized

class myThreadRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am a thread1");
        }
    }
}

class myThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am a thread2");
        }
    }
}

public class task9_1b {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();
        // start() is of Thread class not Runnable so create object of Thread class and
        // pass Runnable object

        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
