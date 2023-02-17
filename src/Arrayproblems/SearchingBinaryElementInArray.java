package Arrayproblems;

public class SearchingBinaryElementInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 100;
        int l = 0;
        int h = a.length - 1;
        boolean flag = false;
        while (l <= h) {
            int midValue = (l + h) / 2;
            if (a[midValue] == key) {
                System.out.println("Elemeny Found..");
                flag = true;
                break;
            }
            if (a[midValue] < key) {
                l = midValue + 1;
            }
            if (a[midValue] > key) {
                h = midValue - 1;
            }
        }
        if(flag==false)
        {
            System.out.println("Element Not Found..!");
        }
    }
}

