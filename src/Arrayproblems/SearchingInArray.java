package Arrayproblems;

public class SearchingInArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int search = 50;
        boolean flag =false;
        for (int i = 0; i < a.length;i++) {
            if(search==a[i]){
                flag = true;
                System.out.println("Element value : " + i);
                break;
            }
        }
        if(flag==false)
        System.out.println("Element not found");
    }
}
