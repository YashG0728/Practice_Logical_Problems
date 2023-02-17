package Arrayproblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortArrayUsingInbuiltMethod {
    public static void main(String[] args) {

        Integer a[] = {4, 1, 2, 6, 7};
        System.out.println("before Sorting: " + Arrays.toString(a));

//        Arrays.parallelSort(a);
//        Arrays.sort(a);
        //descending order
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After Sorting: "+Arrays.toString(a));
    }
}
