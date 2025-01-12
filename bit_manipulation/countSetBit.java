package bit_manipulation;

import java.util.Scanner;

public class countSetBit {
    public static int countBit(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countBit(n));
    }
}
