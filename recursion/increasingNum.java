package recursion;

import java.util.Scanner;

public class increasingNum {
    public static void printNum(int n, int start){
        if(start>n){
            return;
        }
        System.out.println(start);
        printNum(n, start+1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printNum(n, 1);
        printInc(n);
    }
}
