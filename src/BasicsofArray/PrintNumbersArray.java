package BasicsofArray;

public class PrintNumbersArray {
    public static void main(String[] args) {
//        int sum=0;
//        for (int i = 2; i <= 100; i++) {
//            int count =0;
//            for (int j = 1; j < i+1 ; j++) {
//                if(i%j==0){
//                    count++;
//                }
//            }if(count==2){
//                 sum += i;
//                System.out.println(i);
//            }
//        }
//        System.out.println("sum "+sum);
        int sum = 0;
        int j;
        for (int i = 2; i < 50; i++) {
            for ( j = 2; j < i ; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("sum " + sum);
    }

}