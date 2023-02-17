package Arrayproblems;

public class MaxArray {
    public static void main(String[] args) {
        int a[] = {5,19,25,37,45,54,60,2};
        int max = a[0];

        for(int i=1; i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
