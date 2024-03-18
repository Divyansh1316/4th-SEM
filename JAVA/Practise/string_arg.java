/*
Passing input as command line arguments.
*/

public class string_arg {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is : " + sum);
    }
}