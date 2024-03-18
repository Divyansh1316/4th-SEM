/*
1. Implement constructor overloading and demonstrate the working of super() and this()
*/

//this is used to call the constructor of same class
//super is used to call the constructor of parent/super class

class parent {
    parent() {
        System.out.println("This is default constructor of parent class");
    }

    parent(int x) {
        this();
        System.out.println("This is paramaterized constructor of parent class");
    }
}

class child extends parent {
    child() {
        super(10);
        System.out.println("This is default constructor of child class");
    }

    child(int x) {
        this();
        System.out.println("This is paramaterized constructor of child class");
    }
}

public class task4_1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        child ob = new child(10);
    }
}