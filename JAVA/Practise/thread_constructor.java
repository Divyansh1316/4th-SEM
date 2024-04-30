class myThr extends Thread {
    public myThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("HI");
        // while (true) {
        // System.out.println("My thread");
        // }
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        myThr t1 = new myThr("Divyansh");
        myThr t2 = new myThr("Ram");
        t1.start();
        t2.start();
        System.out.println("ID : " + t1.threadId());
        System.out.println("Name : " + t1.getName());
        System.out.println("ID : " + t2.threadId());
        System.out.println("Name : " + t2.getName());
    }
}