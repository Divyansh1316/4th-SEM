/*
2. Implement a java Code to search an element from an array, if found print the
element along with message” Element found”, else print “Element not found.
Try again!!”
 */

import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        int n, ele, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to search : ");
        ele = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found. Try again!!");

        }
        sc.close();
    }
}
