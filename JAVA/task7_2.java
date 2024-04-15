/*
2. Create a class MyCalculator which consists of a single method power (int, int).
This method takes two integers, n and p, as parameters and finds n^p.
If either n or p is negative, then the method must throw an exception which says, "n and p should be nonnegative".
Input Format
Each line of the input contains two integers, n and p.
Output Format
Each line of the output contains the result ,if neither of n and p is negative. Otherwise the output contains "n and p should be nonnegative".
*/

import java.util.*;

class MyCalculator {
    public void power(int n, int p) {
        try {
            if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero");
            } else if (n < 0 || p < 0) {
                throw new Exception("n pr p should not be negative");
            } else {
                System.out.println(Math.pow(n, p));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class task7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter p : ");
        int p = sc.nextInt();
        MyCalculator ob = new MyCalculator();
        ob.power(n, p);
        sc.close();
    }
}