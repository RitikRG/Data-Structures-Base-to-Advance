package patterns_practise;

import java.util.Scanner;

public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        boolean b = true;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                b=false;
            }else{
                b=true;
            }
            for(int j=1;j<=i;j++){
                if(b){
                    System.out.print("1");
                    b=!b;
                }else{
                    System.out.print("0");
                    b=!b;
                }
            }
            System.out.println();
        }
    }
}
