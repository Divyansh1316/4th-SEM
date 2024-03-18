package newpack1;

//same package same class : All can be accessed
public class mypack1 {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void func() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

// same package subclass : Pvt can't be accessed
class c2 extends mypack1 {
    public void func2() {
        System.out.println(a);
        // System.out.println(b); // b is pvt cant be accessed in another subclass
        System.out.println(c);
        System.out.println(d);
    }
}

// same package non-subclass : Pvt can't be accessed
class c3 {
    mypack1 obj = new mypack1();

    public void func3() {
        System.out.println(obj.a);
        // System.out.println(obj.b); // b is pvt cant be accessed in another subclass
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}

// public class mypack1 {
// public static void main(String[] args) {
// c1 ob = new c1();
// ob.func();
// }
// }
