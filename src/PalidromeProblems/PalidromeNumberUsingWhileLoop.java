package PalidromeProblems;

import java.util.Scanner;

public class PalidromeNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any number");
        int num = scanner.nextInt();
        int originalNum = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == originalNum) {
            System.out.println("Numbers Matched SuccessFully : " + originalNum);
        } else {
            System.out.println(" Not a palidrome number " + originalNum);
        }
    }
}
