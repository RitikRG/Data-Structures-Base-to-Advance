package loops_practise;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int ui = sc.nextInt();
        long factorial=1;
        if(ui>0){
            while(ui!=0){
                factorial*=ui;
                ui--;
            }
        }
        System.out.println("Factorail: "+factorial);
    }
}
