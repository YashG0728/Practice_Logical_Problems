package countnumberOfDigitsInANumber;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 50 , b = 40 , c = 30;

        if(a>b && a>c)
        {
            System.out.println("largest num is a : " +a);
        }
        else if (b>a && b>c)
        {
            System.out.println("largest num is b : " +b);
        }
        else
        {
            System.out.println("largest num is c : " +c);
        }
    }
}
