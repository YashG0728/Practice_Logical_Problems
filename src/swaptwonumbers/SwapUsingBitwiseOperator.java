package swaptwonumbers;

public class SwapUsingBitwiseOperator {
    public static void main(String[] args) {
        //what is bitwise operator?
        //bitwise operator is basically a operator whose convert values into 1 and 0
        //here website for convert into bitwise
        //http://easyonlineconverter.com/converters/bitwise-calculator.html
        /* A    B   A XOR B
           0    0   = 0
           0    1   = 1
           1    0   = 1
           1    1   = 0 */

        Integer a = 10;             // 1010- Binary of 10   \\
        Integer b = 20;            //  10100 binary of 20    \\
        //a ^ b =  1 1 1 1 0 = 30 //Addition of binary numbers\\
        System.out.println("Before swapping... " + a + " " + b);

        a = a ^ b; // 10 ^ 20 = 30 http://easyonlineconverter.com/converters/bitwise-calculator.html
        b = b ^ a;  // 30 ^ 20 = 10 http://easyonlineconverter.com/converters/bitwise-calculator.html
        a = a ^ b;  // 30 ^ 10 = 20 http://easyonlineconverter.com/converters/bitwise-calculator.html

        System.out.println("After swapping using third variable... "+a +" "+b);



    }
}
