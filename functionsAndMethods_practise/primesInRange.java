package functionsAndMethods_practise;

import java.util.Scanner;

public class primesInRange {
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int start, int end){
        for(int i=start; i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = sc.nextInt();
        System.out.print("Enter the end value: ");
        int end = sc.nextInt();
        printPrimes(start, end);
    }
}
