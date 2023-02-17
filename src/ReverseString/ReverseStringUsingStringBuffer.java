package ReverseString;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        String str = "hsraps";
        String rev = "";

        StringBuilder stringBuffer = new StringBuilder(str); //StringBuffer is also there
        System.out.println(stringBuffer.reverse());

    }
}
