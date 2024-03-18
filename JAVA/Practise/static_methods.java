//static method belongs to the class rather than the instances of the class. It can be directly accessed without creating an object of the class. It can only access static variables.

class MyClass {
    public int a = 10;

    static void display() {
        // a = 20; //this will result in error as its non-static variable and static
        // function can't access it.
        System.out.println("This is a static method");
    }
}

public class static_methods {
    public static void main(String[] args) {
        MyClass.display(); // directly accessing static method without creating object/instance of class
    }
}