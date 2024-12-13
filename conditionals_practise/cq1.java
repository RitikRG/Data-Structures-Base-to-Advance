package conditionals_practise;

import java.util.Scanner;

public class cq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float ui=sc.nextFloat();
        if(ui<0){
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }
    }
}
