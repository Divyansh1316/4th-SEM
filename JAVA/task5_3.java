/*
3.Construct a Package in java program and demonstrate the working (compilation and execution of java program including package) by Command prompt.
*/

// package newpack1;

class myClass {
    public int a = 10;
    private int b = 20;

    public void func() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class task5_3 {
    public static void main(String[] args) {
        myClass ob = new myClass();
        ob.func();
    }
}

// To compile on command prompt, write :
// javac -d . task5_3.java
// java newpack1.task5_3
