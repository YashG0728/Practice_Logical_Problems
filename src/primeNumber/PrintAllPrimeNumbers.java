package primeNumber;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int j;
        for (int i = 2; i < 50; i++) {
            for ( j = 2; j < i ; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                sum += i;           //sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("sum " + sum);
    }
}
