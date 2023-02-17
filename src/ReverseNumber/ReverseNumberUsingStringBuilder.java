package ReverseNumber;

import java.util.Scanner;

public class ReverseNumberUsingStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number"); //e.g 123
        int num = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        StringBuilder rev = stringBuilder.reverse();
        System.out.println("Reverse number is " + rev);
    }
}
