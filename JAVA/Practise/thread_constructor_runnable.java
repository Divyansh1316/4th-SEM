class myThr implements Runnable {
    public void run() {
        System.out.println("I am a thread1");
    }
}

public class thread_constructor_runnable {
    public static void main(String[] args) {
        myThr ob = new myThr();
        Thread t1 = new Thread(ob, "Divyansh");
        t1.start();
        System.out.println("ID : " + t1.threadId());
        System.out.println("Name : " + t1.getName());
    }
}

// With constructor
// class myThr extends Thread implements Runnable {
// public myThr(String name) {
// super(name);
// }

// public void run() {
// System.out.println("I am a thread1");
// }
// }

// public class thread_constructor_runnable {
// public static void main(String[] args) {
// myThr ob = new myThr("Divyansh");
// Thread t1 = new Thread(ob, "divyansh Runnable");
// t1.start();
// System.out.println("ID : " + t1.threadId());
// System.out.println("Name : " + t1.getName());
// }
// }