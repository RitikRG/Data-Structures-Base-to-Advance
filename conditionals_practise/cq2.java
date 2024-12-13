package conditionals_practise;

import java.util.Scanner;

public class cq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        float ui=sc.nextFloat();
        if(ui>100){
            System.out.println("You have Fever!!");
        }else{
            System.out.println("Chup Chaap College");
        }
    }
}
