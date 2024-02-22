/*
3. Implement Autoboxing and unboxing in java and analyze the result
 */

public class task1_3 {
    public static void main(String[] args) {
        int k = 1;
        Integer I = Integer.valueOf(k); // explicit auto-boxing : primitive to wrapper object
        System.out.println("Explicit auto-boxing : " + I);
        // k=I.intValue(); //explicit auto-unboxing : wrapper obj to primitive data type
        // System.out.println("Explicit auto-unboxing : "+k);
        float z = I; // auto-unboxing
        I = k; // auto-boxing
        k = I; // auto-unboxing
        System.out.println("Auto-unboxing I : " + I + "\nAuto-boxing k : " + k + "\nAuto-unboxing z : " + z);
    }
}
