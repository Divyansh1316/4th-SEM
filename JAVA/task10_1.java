class shop {
    int item;
    boolean x = false;

    synchronized public void produce(int a) {
        item = a;
        try {
            while (x) {
                wait();
            }
            System.out.println(item + " item is being produced by the producer");
            x = true;
            notify();
            System.out.println("waiting for the consumer to consume the item");
        }

        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    synchronized public void consume() {
        try {
            while (!x) {
                wait();
            }
            System.out.println(item + " item is being consumed by the consumer");
            x = false;
            notify();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

class vendor extends Thread {
    shop ob;

    vendor(shop ob) {
        this.ob = ob;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            ob.produce(i);
            ob.consume();

        }
    }
}

public class task10_1 {
    public static void main(String[] args) {
        shop ob = new shop();
        vendor ab = new vendor(ob);
        ab.start();
    }
}
