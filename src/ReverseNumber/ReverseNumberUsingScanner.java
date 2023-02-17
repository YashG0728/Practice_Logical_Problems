package ReverseNumber;

import java.util.Scanner;

public class ReverseNumberUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number"); //e.g 123
        int num = scanner.nextInt();

        int rev = 0;
        while (num != 0) {              //check the number in num e.g here is 123 now
            rev = rev * 10 + num % 10;  //num%10 taking remainder value
            num = num / 10;
            //firstLoop //Remainder calculator : https://www.calculatorsoup.com/calculators/math/longdivision.php
            /*here num = 123 and rev =
              rev  = 0 * 10 + 123 % 10 = 0 + 3 = 3
              123/10 = 12
            */
            //new value of num is 12 and rev is 3
            /*
              3 * 10 + 12 % 10 = 130 + 12 % 10 = 30 + 2 = 32
              12 / 10 = 1
            *///new value of num is 1 and rev is 32

            /*
              32 * 10 + 1 % 10 = 1320 + 12 % 10 = 320 + 1 = 321
              1 / 10 = 0
            *///new value of num is 0 and rev is 321

        }
        System.out.println("Reverse number is " + rev);
    }
}
