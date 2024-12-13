package patterns_practise;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of l: ");
        int l = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        for(int i=1;i<=l;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || i==l){
                    System.out.print('*');
                }else if(j==1 || j==b){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
