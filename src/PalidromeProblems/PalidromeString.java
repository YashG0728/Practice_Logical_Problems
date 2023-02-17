package PalidromeProblems;

import java.util.Scanner;

public class PalidromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str= scanner.next();

//        String originalString = str;
        String rev = "";
        for (int i = str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Its a palidrome "+ rev);
        }else {
            System.out.println("Not a palidrome "+ rev);
        }
    }
}
