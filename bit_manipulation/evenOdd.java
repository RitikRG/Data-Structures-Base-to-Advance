package bit_manipulation;

import java.util.Scanner;

public class evenOdd {
    public static boolean isOdd(int n){
        if((n&1)==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
         System.out.println(isOdd(n));
    }
}
