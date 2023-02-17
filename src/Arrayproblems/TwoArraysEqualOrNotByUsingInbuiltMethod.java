package Arrayproblems;

import java.util.Arrays;

public class TwoArraysEqualOrNotByUsingInbuiltMethod {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};
        System.out.println(Arrays.equals(a,b));
        System.out.println("------------------------");
        boolean status = Arrays.equals(a,b);
        if(status == true){
            System.out.println("Arrays are same");
        }else {
            System.out.println("Arrays are different");
        }
    }
}
