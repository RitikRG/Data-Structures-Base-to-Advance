package basicSortingAlgos;

import java.util.Arrays;

public class countingSort {
    public static void countingSort(int[] arr){
        int max=arr[0];
        for(int i=1; i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        int[] countingArray=new int[max+1];
        for(int i=0; i<arr.length;i++){
            countingArray[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<countingArray.length;i++){
            int count=countingArray[i];
            while (count>0) {
                arr[j]=i;
                count--;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] num={1,4,1,3,2,4,3,7};
        countingSort(num);
        System.out.println(Arrays.toString(num));
    }
}
