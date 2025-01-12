package functionsAndMethods_practise;

import java.util.Scanner;

public class binomialCoefficient {
    
    public static long factorial(int n){
        long res=1;
        while(n>0){
            res*=n;
            n--;
        }
        return res;
    }
    public static long bc(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.println(bc(n, r));
    }
}