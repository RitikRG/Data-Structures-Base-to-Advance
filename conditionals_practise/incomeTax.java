package conditionals_practise;

import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income.");
        long income = sc.nextLong();
        if(income<500000){
            System.out.println("Tax Bracket: 0%");
            System.out.println("Tax Amount to be paid: Rs. 0");
        }else if(income <=1000000){
            System.out.println("Tax Bracket: 20% Tax");
            double taxAmt=(0.2*income);
            System.out.println("Tax Amount: Rs."+ taxAmt);
        }else{
            System.out.println("Tax bracket: 30%");
            double taxAmt = 200000 + (income-1000000)*0.3;
            System.out.println("Tax Amount: Rs."+ taxAmt);
        }
    }
}
