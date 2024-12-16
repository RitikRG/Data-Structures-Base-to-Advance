package basicSortingAlgos;

import java.util.Arrays;

public class insertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }      
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={5,2,4,1,3,7,6,9,8};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }
}
