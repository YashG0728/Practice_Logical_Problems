package ReverseString;

public class ReverseStringUsingCharacterArray {
    public static void main(String[] args) {
        String str = "hsraps";
        String rev = "";
        char a[] = str.toCharArray();
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        System.out.println(rev);
    }
}
//    String str = "Welcome to java";
//        for (int i = str.length()-1; i >= 0; --i) {
//                char ch = str.charAt(i);
//                System.out.print(ch);

