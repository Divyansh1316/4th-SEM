/*
4.Draw the access protection table of incorporating packages and validate all the
scenarios with the help of java program.
*/

// package newpack1;

//same package same class : All can be accessed
public class task5_4 {
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
class c2 extends task5_4 {
    public void func2() {
        System.out.println(a);
        // System.out.println(b); // b is pvt cant be accessed in another subclass
        System.out.println(c);
        System.out.println(d);
    }
}

// same package non-subclass : Pvt can't be accessed
class c3 {
    task5_4 obj = new task5_4();

    public void func3() {
        System.out.println(obj.a);
        // System.out.println(obj.b); // b is pvt cant be accessed in another subclass
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}

// public class task5_4 {
// public static void main(String[] args) {
// c1 ob = new c1();
// ob.func();
// }
// }

/*
 * //creating another package in a different file
 * 
 * package newpack2.com;
 * 
 * import newpack1.*;
 * 
 * // different package subclass : Pvt and default can't be accessed
 * class c4 extends task5_4  {
 * public void func4() {
 * System.out.println(a);
 * // System.out.println(b); // b is pvt cant be accessed in another subclass
 * System.out.println(c);
 * // System.out.println(d); // d is default cant be accessed in another
 * subclass
 * }
 * }
 * 
 * // different package non-subclass : Pvt,protected and default can't be
 * accessed
 * class c5 {
 * task5_4  obj = new task5_4 ();
 * 
 * public void func5() {
 * System.out.println(obj.a);
 * // System.out.println(obj.b); // b is pvt cant be accessed in another
 * subclass
 * // System.out.println(obj.c); // c is protected cant be accessed in another
 * // subclass
 * // System.out.println(obj.d); // d is default cant be accessed in another
 * // subclass
 * }
 * }
 * 
 * public class mypack2 {
 * public static void main(String[] args) {
 * c4 ob = new c4();
 * ob.func4();
 * c5 ob1 = new c5();
 * ob1.func5();
 * System.out.println("This is package 2");
 * }
 * }
 */
