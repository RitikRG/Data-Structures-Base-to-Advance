package basicSortingAlgos;

import java.util.Arrays;

public class bubbleSort {
    public static int[] bubbleSort(int[] arr){
        int l=arr.length-1;
        while(l>0){
            for(int i=0; i<l; i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            l--;
        }
        return arr;
    }
    public static void  main(String[] args) {
        int[] nums ={5,2,4,1,3,7,6,9,8};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
