package ReverseNumber;

import java.util.Scanner;

public class ReverseNumberUsingStringbuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number"); //e.g 123
        int num = scanner.nextInt();
        StringBuffer rev;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(num));
        rev = stringBuffer.reverse();
        System.out.println("Reverse number is " + rev);
    }
}
