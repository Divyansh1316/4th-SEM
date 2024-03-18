// static import helps to access the static methods and fields of other classes
// without specifying the class name

/*
 * import static Myclass1.x;
 * import static Myclass1.display;
 * 
 * public class static_import2 {
 * public static void main(String[] args) {
 * System.out.println(x);
 * fun();
 * }
 * }
 */

import static java.lang.System.*;
import static java.lang.Math.*;

public class static_import2 {
    public static void main(String[] args) {
        out.println("Static import");
        out.println(sqrt(25));
    }
}