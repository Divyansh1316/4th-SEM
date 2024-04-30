//thread implementation by extending thread class
//output will not be synchronized and will be interleaved (even inside the same function)

class myThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My thread1 is running");
            System.out.println("Happy");
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My thread2 is good");
            System.out.println("Sad");
        }
    }
}

public class task9_1a {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start(); // used to start a thread, calls run method internally
        t2.start();
    }
}
