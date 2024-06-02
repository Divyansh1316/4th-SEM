//producer consumer using synchronize method and using Runnable interface

class shop {
    boolean item_available = false;
    int item;

    synchronized public void produce(int x) {
        try {
            if (item_available) {
                System.out.println("Waiting for consumer to consume the item");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        item = x;
        item_available = true;
        System.out.println(item + " has been produced");
        notify();
    }

    synchronized public void consume() {
        try {
            if (!item_available) {
                System.out.println("Waiting for producer to produce the item");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        item_available = false;
        System.out.println(item + " has been consumed");
        notify();
    }
}

class Producer implements Runnable {
    shop ob;

    Producer(shop ob) {
        this.ob = ob;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            ob.produce(i);
        }
    }
}

class Consumer implements Runnable {
    shop ob;

    Consumer(shop ob) {
        this.ob = ob;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            ob.consume();
        }
    }
}

public class pc_smethod {
    public static void main(String[] args) {
        shop ob = new shop();
        Producer pr = new Producer(ob);
        Consumer cr = new Consumer(ob);
        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(cr);
        t1.start();
        t2.start();
    }
}