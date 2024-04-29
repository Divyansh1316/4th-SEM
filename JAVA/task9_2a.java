// synchronized method:

//if we remove this synchronized method then it will give interleaved output because multiple threads will be accessing the print method concurrently.

class clg1 {
    synchronized void print(String faculty) {
        for (int i = 0; i < 100; i++) {
            System.out.println(faculty);
        }
    }
}

class myThr extends Thread {
    clg1 ci;
    String faculty;

    public void run() {
        ci.print(faculty);
    }

    public myThr(clg1 ci, String faculty) {
        this.ci = ci;
        this.faculty = faculty;
    }
}

public class task9_2a {
    public static void main(String[] args) {
        clg1 ci = new clg1();
        myThr mt1 = new myThr(ci, "Divyansh");
        mt1.start();
        myThr mt2 = new myThr(ci, "Ansh");
        mt2.start();
    }
}