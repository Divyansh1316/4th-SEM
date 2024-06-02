//producer consumer problem

class shop {
    boolean item_available = false;
    int item;

    public void produce(int x) {
        synchronized (this) {
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
    }

    public void consume() {
        synchronized (this) {
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
}

class Producer extends Thread {
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

class Consumer extends Thread {
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

public class pc {
    public static void main(String[] args) {
        shop ob = new shop();
        Producer pr = new Producer(ob);
        Consumer cr = new Consumer(ob);
        pr.start();
        cr.start();
    }
}