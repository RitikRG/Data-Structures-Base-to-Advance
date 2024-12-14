package functionsAndMethods_practise;

import java.util.Scanner;

public class binaryToDecimal {
    
    public static long binaryToDecimal(long n){
        long res=0;
        int i=0;
        while(n!=0){
            long temp = n%10;
            if(temp==1){
                res+=Math.pow(2, i);
            }
            n/=10;
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value: ");
        long n= sc.nextLong();
        System.out.println(binaryToDecimal(n));
    }
}
