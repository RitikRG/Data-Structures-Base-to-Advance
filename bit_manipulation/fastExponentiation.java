package bit_manipulation;

import java.util.Scanner;

public class fastExponentiation {
    public static int power(int a, int n){
        int ans =1;
        while (n>0) {
            if((n&1)==1){
                ans*=a;
            }
            a*=a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(a,n));
    }
}
