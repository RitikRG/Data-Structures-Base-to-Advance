package loops_practise;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valur of N: ");
        int n = sc.nextInt();
        int i=1;
        while (i<11) {
            System.out.println(n+"*"+i+"="+i*n);
            i++;
        }
    }
}
