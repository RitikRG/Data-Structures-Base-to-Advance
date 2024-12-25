package bit_manipulation;

import java.util.Scanner;

public class powerOfTwo {
    public static boolean isPower(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPower(n));
    }
}
