package functionsAndMethods_practise;

import java.util.Scanner;

public class palindrome {
    public static int reverseNum(int n){
        int res=0;
        while(n>0){
            res=res*10+n%10;
            n/=10;
        }
        return res;
    }
    public static boolean isPalindrome(int n){
        int rev = reverseNum(n);
        if(n==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
