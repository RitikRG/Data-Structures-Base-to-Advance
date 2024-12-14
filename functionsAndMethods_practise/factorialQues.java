package functionsAndMethods_practise;

import java.util.Scanner;

public class factorialQues {
    
    public static long factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
