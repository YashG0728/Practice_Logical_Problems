package CountWordsInString;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine() ;
        int count = 1;
        for (int i = 0; i < str.length()-1; i++) {
           if((str.charAt(i)==' ') && (str.charAt(i+1) !=' ')){
               count++;
            }
        }
        System.out.println("Number of words in a string: "+count);
    }
}
