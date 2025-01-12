package functionsAndMethods_practise;

import java.util.Scanner;

public class decimalToBinary {
    public static long reverseBinary(String n){
        String res="";
        for(int i=n.length()-1; i>=0; i--){
            res = res + n.charAt(i);
        }
        return Long.valueOf(res);
    }
    public static long deciToBinary(long n){
        String res="";
        while (n!=0) {
            res=res + n%2;
            n/=2;
        }
        return reverseBinary(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal values:" );
        long n = sc.nextLong();
        System.out.println(deciToBinary(n));
    }
}
