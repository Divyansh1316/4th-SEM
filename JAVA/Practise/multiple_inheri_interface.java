interface I1 {
    void m1();

    void m2();
}

interface I2 {
    void m3();

    void m4();
}

class myClass implements I1, I2 {
    public void m1() {
        System.out.println("M1 implemented");
    }

    public void m2() {
        System.out.println("M2 implemented");
    }

    public void m3() {
        System.out.println("M3 implemented");
    }

    public void m4() {
        System.out.println("M4 implemented");
    }
}

public class multiple_inheri_interface {
    public static void main(String[] args) {
        // myClass ob = new myClass();
        // ob.m1();
        // ob.m2();
        // ob.m3();
        // ob.m4();
        I1 ob1 = new myClass();
        ob1.m1();
        ob1.m2();
        I2 ob2 = new myClass();
        ob2.m3();
        ob2.m4();
    }
}
