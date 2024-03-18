/*
3. Implement Autoboxing and unboxing in java and analyze the result
 */

public class task1_3 {
    public static void main(String[] args) {
        // auto-boxing : converting primitive data type to wrapper class object
        int a = 10;
        Integer I = a;
        System.out.println("Auto-boxing : " + I);
        // explicit auto-boxing
        Integer G = Integer.valueOf(a);
        System.out.println("Explicit auto-boxing : " + G);
        // unboxing : converting wrapper class object to primitive data type
        @SuppressWarnings("removal")
        Integer K = new Integer(20);
        int b = K;
        System.out.println("Unboxing : " + b);
        // explicit unboxing
        int c = K.intValue();
        System.out.println("Explicit unboxing : " + c);
    }
}
