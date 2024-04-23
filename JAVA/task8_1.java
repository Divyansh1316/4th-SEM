/*
1.Implement a Program to replace all 0's with 1 in a given integer. Given an integer as an input, all the 0's in the number has to be replaced with 1.
For example, consider the following number
Input: 102405
Output: 112415
Input: 56004
Output: 56114
*/

class func {
    public int replaceZero(int num) {
        int digit = 0, sum = 0, mul = 1;
        while (num > 0) {
            digit = num % 10;
            if (digit == 0) {
                sum += 1 * mul + digit;
            } else {
                sum += digit * mul;
            }
            mul *= 10;
            num /= 10;
        }
        return sum;
    }
}

public class task8_1 {
    public static void main(String[] args) {
        int i1 = 102405;
        func ob = new func();
        int res = ob.replaceZero(i1);
        System.out.println("Input : " + i1);
        System.out.println("Output : " + res);
    }
}