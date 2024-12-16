package basicSortingAlgos;

import java.util.Arrays;

public class selectionSort {
    public static int[] selectionSort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
            }
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
            i++;
        }


        return arr;
    }
    public static void main(String[] args) {
        int[] nums={5,2,4,1,3,7,6,9,8};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }
}
