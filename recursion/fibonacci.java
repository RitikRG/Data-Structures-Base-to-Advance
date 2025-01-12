package recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fibonacciTail(int n, int b, int a){
        if(n==2){
            return b;
        }
        return fibonacciTail(n-1, b+a, b);
    }
    public static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacciTail(n,1,1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
