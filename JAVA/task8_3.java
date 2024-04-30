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
