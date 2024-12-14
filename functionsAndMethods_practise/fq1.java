package functionsAndMethods_practise;

import java.util.Scanner;

public class fq1 {
    public static double average(double  n1, double n2, double n3){
        return (n1+n2+n3)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2=sc.nextInt();
        System.out.print("Enter number 3: ");
        int n3=sc.nextInt();

        System.out.println("Average: "+average(n1, n2, n3));
    }
}
