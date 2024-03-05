/*
Implement constructor overloading and demonstrate the working of super()
and this()
 */
class parent {
    parent() {
        System.out.println("Parent class default constructor");
    }

    parent(int x) {
        this();
        System.out.println("Parent class parameterized constructor");
    }
}

class child extends parent {
    int x = 10;

    child() {
        super(10);
        System.out.println("Child class default constructor");
    }

    child(int x) {
        this();
        System.out.println("Child class parameterized constructor");
    }
}

public class week4_1 {
    public static void main(String[] args) {
        child ob = new child(10);
        ob.x = 1;
    }
}