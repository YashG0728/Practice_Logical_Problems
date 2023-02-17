package swaptwonumbers;

public class SwapNumbersUsingMultiplicationAndDivisionOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping... " + a + " " + b);

        //swap using multiplication and division operator
        //here a and b should not be zero

        a = a * b; //10*20=200
        b = a / b; //200/20=10
        a = a / b; //200/10=20

        System.out.println("After swapping using third variable "+a +" "+b);
    }
}
