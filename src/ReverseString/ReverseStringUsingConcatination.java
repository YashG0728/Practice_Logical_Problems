package ReverseString;

public class ReverseStringUsingConcatination {
    public static void main(String[] args) {
        String str = "hsraps";
        String rev = "";
        int len = str.length();
        for (int i = len-1; i >= 0; i--) { //len - 1 means index 0 to lenfth od character e.g here is 5 letter means 5-1=4
            rev =  rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
