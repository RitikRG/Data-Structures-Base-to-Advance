package loops_practise;

import java.util.Scanner;

public class lq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long evenSum=0;
        long oddSum=0;
        do{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }

            System.out.println("Continue? 1 for continue; 0 for stop");
            int conti = sc.nextInt();
            if(conti==0){
                break;
            }
        }while(true);
        System.out.println("Even Sum: "+evenSum);
        System.out.println("Odd Sum: "+oddSum);
    }
}
