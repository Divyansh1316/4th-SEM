//The priorities help the thread scheduler decide which thread to execute next when multiple threads are ready to run. However, they do not guarantee the order of execution

class newThread extends Thread {
    newThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thanks : " + this.getName());
        }
    }
}

public class thread_priority {
    public static void main(String[] args) {
        newThread t1 = new newThread("Divyansh");
        newThread t2 = new newThread("Aman");
        newThread t3 = new newThread("Rahul");
        newThread t4 = new newThread("Ram");
        newThread t5 = new newThread("Shyam");
        t5.setPriority(Thread.MAX_PRIORITY);
        // or t5.setPriority(10); //values can be 1-10

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println(t5.getPriority());
    }
}