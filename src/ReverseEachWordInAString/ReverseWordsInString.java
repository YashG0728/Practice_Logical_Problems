package ReverseEachWordInAString;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Welcome To Java";
        String[] words = str.split(" ");
        String reverseString = "";
        for (String w : words) {
            String reverseWords = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                reverseWords = reverseWords + w.charAt(i);
            }
            reverseString=reverseString+reverseWords+" ";
        }
        System.out.println(reverseString);
    }
}
