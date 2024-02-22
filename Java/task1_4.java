/*
4. Using the switch statement, write a menu-driven program to calculate the maturity amount
of a bank deposit.
The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit
For option (i) accept Principal (p), rate of interest (r) and time period in years (n). Calculate
and output the maturity amount (a) receivable using the formula a = p[1 + r / 100]n
.For option
(ii) accept monthly installment (p), rate of interest (r) and time period in months (n).
Calculate and output the maturity amount (a) receivable using the formula a = p * n +( p *
n(n + 1) / 2 * r / 100 * 1 /12.
For an incorrect option, an appropriate error message should be displayed.
[ Use Scanner Class to take input ] 
 */

import java.util.*;

public class task1_4 {
    public static void main(String[] args) {
        double p, r, n, a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice :\n1. for Term Deposit\n2. for Recurring Deposit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter principal : ");
                p = sc.nextDouble();
                System.out.println("Enter rate of interest : ");
                r = sc.nextDouble();
                System.out.println("Enter time period in years : ");
                n = sc.nextDouble();
                a = p * Math.pow((1 + (r / 100)), n);
                System.out.println("Maturity amount is : " + a);
                break;
            case 2:
                System.out.println("Enter monthly installment : ");
                p = sc.nextDouble();
                System.out.println("Enter rate of interest : ");
                r = sc.nextDouble();
                System.out.println("Enter time period in months : ");
                n = sc.nextDouble();
                a = p * n + (p * n * (n + 1) / 2 * r / 100 * 1 / 12);
                System.out.println("Maturity amount is : " + a);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
