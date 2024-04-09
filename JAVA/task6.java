class ArrayDemo {
    void arrayFunc(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + key);
                }
            }
        }
    }

    void arrayFunc(int A[], int p, int B[], int q) {
        int i = 0, j = 0, k = 0, sz = p + q;
        int[] temp = new int[sz];
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = B[j++];
            }
        }
        while (i < p) {
            temp[k++] = A[i++];
        }
        while (j < q) {
            temp[k++] = B[j++];
        }
        for (int l = 0; l < p; l++) {
            A[l] = temp[l];
        }
        for (int m = 0; m < q; m++) {
            B[m] = temp[p + m];
        }
        System.out.println("A : ");
        for (int l = 0; l < A.length; l++) {
            System.out.print(A[l] + " ");
        }
        System.out.println("\nB : ");
        for (int l = 0; l < B.length; l++) {
            System.out.print(B[l] + " ");
        }
    }
}

public class task6 {
    public static void main(String[] args) {
        ArrayDemo ob1 = new ArrayDemo();
        int[] arr = { 4, 6, 5, -10, 8, 5, 20 };
        ob1.arrayFunc(arr, 10);
        ArrayDemo ob2 = new ArrayDemo();
        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        ob2.arrayFunc(A, 6, B, 3);
    }
}