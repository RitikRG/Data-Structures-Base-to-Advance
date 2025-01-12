package recursion;

import java.util.Arrays;
import java.util.Scanner;


public class sorted {
    public static boolean isSorted(int[] arr){
        if(arr.length<=1){
            return true;
        }
        if(arr[0]<arr[1]){
            return true & isSorted(Arrays.copyOfRange(arr,2,arr.length));
        }
        return false;
    }
    public static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return true & isSorted(arr, i+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,15,6,7,8};
        System.out.println(isSorted(arr));
        
        System.out.println(isSorted(arr,0));
    }
}
