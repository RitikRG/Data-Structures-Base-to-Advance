package bit_manipulation;

import java.util.Scanner;

import patterns_practise.solidRhombus;

public class bit_operations {
    public static int getIth(int n, int i){
        int bitMask=n>>i;
        if((1&bitMask)==1){
            return 1;
        }
        return 0;
    }
    public static int setBit(int n, int i){
        int bitmask = 1<<i;
        return (n|bitmask);
    }
    public static int clearBit(int n, int i){
        int bitmask = 1<<i;
        bitmask=~(bitmask);
        return (n&bitmask);
    }
    public static int updateBit(int n, int i, int val){
        if(val==0){
            return clearBit(n, i);
        }
        return setBit(n, i);
    }
    public static int clearLastIBits(int n, int i){
        n=n>>i;
        return n<<i;
    }
    public static int clearRange(int n, int i, int j){
        for(int k=i;k<j;k++){
            n=clearBit(n, k);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number");
        // int n=sc.nextInt();
        // System.out.print("Enter the value of i: ");
        // int i=sc.nextInt();
        // System.out.println(getIth(n, i));

        // System.out.print("Enter number");
        // n=sc.nextInt();
        // System.out.print("Enter the value of i: ");
        // i=sc.nextInt();
        // System.out.println(setBit(n, i));

        // System.out.print("Enter number");
        // n=sc.nextInt();
        // System.out.print("Enter the value of i: ");
        // i=sc.nextInt();
        // System.out.println(clearBit(n, i));


        // System.out.print("Enter number");
        // n=sc.nextInt();
        // System.out.print("Enter the value of i: ");
        // i=sc.nextInt();
        // System.out.println(updateBit(n, i, 0));


        // System.out.print("Enter number");
        // n=sc.nextInt();
        // System.out.print("Enter the value of i: ");
        // i=sc.nextInt();
        // System.out.println(clearLastIBits(n, i));

        System.out.print("Enter number");
        int n=sc.nextInt();
        System.out.print("Enter the value of i: ");
        int i=sc.nextInt();
        System.out.print("Enter the value of j: ");
        int j=sc.nextInt();
        System.out.println(clearRange(n, i, j));

    }
}
