//a static variable is initialized once and retains its value during the execution of the program and its value is shared among all the instances of the class in which its defined

class MyClass {
    static int a = 0;

    MyClass() {
        a++;
    }

    public void display() {
        System.out.println(a);
    }
}

public class static_variable {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        MyClass ob1 = new MyClass(); // counter a will be incremented to 1 as its static
        MyClass ob2 = new MyClass(); // counter a will be incremented to 2
        MyClass ob3 = new MyClass(); // counter a will be incremented to 3
        ob3.display();
        // System.out.println(MyClass.a); // op=3 another way to access static member
        // (in static way) without using a separate display function.
    }
}