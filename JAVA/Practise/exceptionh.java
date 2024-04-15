import java.util.Scanner;

//default throw default catch
class dtdc {
    public void fun1() {
        int a, b = 2, c = 0;
        a = b / c;
        System.out.println(a);
    }
}

// default throw user catch
class dtuc {
    public void fun2() {
        try {
            @SuppressWarnings("unused")
            int a, b = 2, c = 0;
            a = b / c;
        } catch (ArithmeticException e) {
            System.out.println("Invalid operation");
        }
    }
}

// user throw default catch
class utdc {
    public void fun3() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        if (age < 18) {
            throw new ArithmeticException("Invalid age");
        }
        System.out.println("valid");
    }
}

// user throw user catch
class utuc {
    public void fun4() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new ArithmeticException("Invalid");
            }
            System.out.println("valid");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

// user throw user catch custom
class AgeEligible extends Exception {
    AgeEligible() {
        System.out.println("Invalid operation ");
    }
}

class utucCustom {
    public void fun5() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new AgeEligible();
            }
            System.out.println("valid");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class exceptionh {
    public static void main(String[] args) throws AgeEligible {
        // dtdc ob1 = new dtdc();
        // ob1.fun1();
        // dtuc ob2 = new dtuc();
        // ob2.fun2();
        // utdc ob3 = new utdc();
        // ob3.fun3();
        // utuc ob4 = new utuc();
        // ob4.fun4();
        utucCustom ob5 = new utucCustom();
        ob5.fun5();
    }
}
