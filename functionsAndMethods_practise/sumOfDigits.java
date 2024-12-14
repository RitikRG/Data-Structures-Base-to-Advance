package functionsAndMethods_practise;

import java.util.Scanner;

public class sumOfDigits {
    public static int sumOfDigits(int n){
        int sum=0;
        while (n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
