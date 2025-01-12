package loops_practise;

import java.util.Scanner;

public class breakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.print("Enter a number: ");
            a = sc.nextInt();

        }while(a%10!=0);
    }
}
