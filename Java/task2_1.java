import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        int num1, num2;
        float sum1 = 0, sum2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        num2 = sc.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        sum1 /= num1;
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }
        sum2 /= num2;
        if (sum1 == sum2) {
            System.out.println("Friendly pair");
        } else {
            System.out.println("Not a friendly pair");
        }
        sc.close();
    }
}
