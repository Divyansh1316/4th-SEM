/*
Implement a program that creates two threads- one thread with the name CSThread and other ITThread and execute after a gap of 1000 miliseconds. Each thread should also display a number indicating the number of times it got a chance to execute.
*/

class CSThread extends Thread {
    public void run() {
        int count = 0;
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thanks  1");
                System.out.println(++count);
                System.out.println(getName());
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ITThread extends Thread {
    public void run() {
        int count = 0;
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thanks  2");
                System.out.println(++count);
                System.out.println(getName());
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class thread_sleep_classQues {
    public static void main(String[] args) {
        CSThread t1 = new CSThread();
        t1.start();
        ITThread t2 = new ITThread();
        t2.start();
    }
}
