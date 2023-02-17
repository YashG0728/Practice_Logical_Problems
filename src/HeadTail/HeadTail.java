package HeadTail;


import java.util.Scanner;

public class HeadTail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int head=0;
        int tail=0;
        System.out.println("Enter flip value : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int randoms = (int) (Math.floor(Math.random()*10)%2);
            if(head==randoms){
                head++;
                System.out.println("Heads count : " + head);
            }else{
                tail++;
                System.out.println("Tails count : " + tail);
            }
        }
        int per = (head*100)/num;
        int per1 = (tail*100)/num;
        System.out.println("Heads : "+per+"%");
        System.out.println("Tails : "+per1+"%");
    }
}
