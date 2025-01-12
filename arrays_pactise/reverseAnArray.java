package arrays_pactise;

import java.lang.reflect.Array;
import java.util.*;

public class reverseAnArray {
    public static int[] reverse(int arr[]){
        int res[] = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            res[j]=arr[i];
            j++;
        }
        return res;
    }
    public static int[] reverse_inplace(int arr[]){
        int j=arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,23,445,6,7,8,99,101,120,131,145,156,167,178,189,200};
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(reverse(arr))); 
        System.out.println(Arrays.toString(reverse_inplace(arr))); 
    }
}
