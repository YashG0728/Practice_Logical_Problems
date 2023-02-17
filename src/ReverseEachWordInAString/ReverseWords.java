package ReverseEachWordInAString;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Welcome to java";
        char[] arr = str.toCharArray();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
