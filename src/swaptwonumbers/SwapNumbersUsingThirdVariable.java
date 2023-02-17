package swaptwonumbers;

public class SwapNumbersUsingThirdVariable {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping... " + a + " " + b);
        //Logic One store in the 3rd variable
        int t=a;
        a=b;
        b=t;

        System.out.println("After swapping using third variable "+a +" "+b);

    }


}
