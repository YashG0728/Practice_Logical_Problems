package Arrayproblems;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String[] args) {
        int a[] = {4, 1, 2, 6, 7};
        System.out.println("before Sorting: " + Arrays.toString(a));

        int n = a.length;

        for (int i = 0; i <= n; i++) {                  //i=0 n=5
            for (int j = 0; j < n - 1; j++) {           //n=5
                if (a[j] > a[j + 1]) {                  // a = array j = 0
                    int temp = a[j];                    //a= array, j = 0
                    a[j] = a[j + 1];                    //j=0
                    a[j + 1] = temp;                    //a:1,1,2,6,7 j=0 temp=4
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(a) );
    }
}
