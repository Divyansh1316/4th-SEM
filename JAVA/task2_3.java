/*
3. An array contains both positive and negative numbers in random order.
Rearrange and sort the array elements so that all negative numbers appear
before all positive numbers.
Typical Input: -22, 10, -14, -15,16, -70, 50, -13, -36
Typical Output: -70 -36 -22 -15 -14 -13 10 16 50
 */

import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}