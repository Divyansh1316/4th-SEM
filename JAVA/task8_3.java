/*
3. Program to find all the patterns of 0(1+)0 in the given string. Given a string
containing 0's and 1's, find the total number of 0(1+)0 patterns in the string and
output it.
0(1+)0 - There should be at least one '1' between the two 0's.
For example, consider the following string.
Input: 01101111010
Output: 3
Explanation:
01101111010 - count = 1
01101111010 - count = 2
01101111010- count = 3
*/

class myClass {
    void func(String s) {
        int n = s.length();
        int[] arr = new int[n];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = 0;
        }
        int k = 0, count = 0;
        if (s.charAt(0) == '0') {
            arr[k] = 0;
            k++;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0' && s.charAt(i - 1) != '0') {
                arr[k] = i;
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] == arr[i + 1] + 1) && arr[i + 1] != 0) {
                count++;
            }
        }
        System.out.println("Number of patterns : " + count);
    }
}

public class task8_3 {
    public static void main(String[] args) {
        String s1 = "0101100101011";
        myClass ob = new myClass();
        ob.func(s1);
    }
}
