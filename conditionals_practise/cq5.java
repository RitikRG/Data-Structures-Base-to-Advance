package conditionals_practise;

import java.util.*;

public class cq5{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("Century leap year");
        }else if(year%100==0){
            System.out.println("Not a leap year");
        }else if(year%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap year!!");
        }
    }
}