package loops_practise;

import java.util.Scanner;

public class printReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long userInput = sc.nextLong();
        long rev=0;
        while (userInput!=0) {
            rev=rev*10 + userInput%10;
            userInput/=10;
        }
        System.out.println(rev);
    }
}
