package arrays_pactise;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={5,20,4,3,9,7,85,31,24,56,84,-114};
        System.out.print("Enter the element that you want to search: ");
        int target = sc.nextInt();
        boolean isFound=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                isFound=true;
                System.out.println("Element present at index number: "+i);
            }
            if(i==arr.length-1 && !isFound){
                System.out.println("Element is not present in the given array...");
            }
        } 
    }
}
