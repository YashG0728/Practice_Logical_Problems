package swaptwonumbers;

public class SwapNumberUsingFormula {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping... " + a + " " + b);

        b = a + b - (a = b);  //exection start right to left
        /*here (a = b) means we assign value of a equal to b
        means a = 20 now*/
        /*then a + b means 10 + 20 = 30 */
        //and the output is 30 - 20 = 10 the new value of b is 10 now

        System.out.println("After swapping using third variable "+a +" "+b);
    }
}
