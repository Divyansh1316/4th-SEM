/*
2. Printing an array into Zigzag fashion. Suppose you were given an array of integers, and you are told to sort the integers in a zigzag pattern. In general, in a zigzag pattern, the first integer is less than the second integer, which is greater than the third integer,
which is less than the fourth integer, and so on. Hence, the converted array should be
in the form of e1 < e2 > e3 < e4 > e5 < e6
Test cases:
Input 1:
7
4 3 7 8 6 2 1
Output 1:
3 7 4 8 2 6 1
Input 2:
4
1 4 3 2
Output 2:
1 4 2 3
*/

import java.util.Scanner;

class func {
    public void zigzag(int[] arr) {
        boolean condition = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (condition) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            condition = !condition;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class task8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        func ob = new func();
        ob.zigzag(arr);
        sc.close();
    }
}