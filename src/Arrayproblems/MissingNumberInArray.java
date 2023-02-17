package Arrayproblems;

public class MissingNumberInArray {
    public static void main(String[] args) {
        //Arrays should not have duplicates
        //arrays no need to be sorted order
        //arrays should be in a proper range

        int a[] = {1, 2, 4, 5};
        //1+2+4+5=sum1
        //1+2+3+4+5=sum2
        //sum2-sum1=sum2=15-12=3
        int sum1 = 0;
        for (int i=0;i<a.length;i++){
            sum1 = sum1+a[i];
        }
        System.out.println("Sum of elements in array "+sum1);
        int sum2 = 0;
        for (int i=1; i <= 5; i++) {
            sum2=sum2+i;
        }
        System.out.println("Sum of elements in array "+sum2);
        int missingNumber = sum2-sum1;
        System.out.println("Missing Number In Arrays "+ missingNumber );
    }
}
