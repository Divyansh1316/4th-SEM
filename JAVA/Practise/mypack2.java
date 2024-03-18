package newpack2.com;

import newpack1.*;

// different package subclass : Pvt and default can't be accessed
class c4 extends mypack1 {
    public void func4() {
        System.out.println(a);
        // System.out.println(b); // b is pvt cant be accessed in another subclass
        System.out.println(c);
        // System.out.println(d); // d is default cant be accessed in another subclass
    }
}

// different package non-subclass : Pvt,protected and default can't be accessed
class c5 {
    mypack1 obj = new mypack1();

    public void func5() {
        System.out.println(obj.a);
        // System.out.println(obj.b); // b is pvt cant be accessed in another subclass
        // System.out.println(obj.c); // c is protected cant be accessed in another
        // subclass
        // System.out.println(obj.d); // d is default cant be accessed in another
        // subclass
    }
}

public class mypack2 {
    public static void main(String[] args) {
        c4 ob = new c4();
        ob.func4();
        c5 ob1 = new c5();
        ob1.func5();
        System.out.println("This is package 2");
    }
}
