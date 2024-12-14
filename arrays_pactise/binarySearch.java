package arrays_pactise;

import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={-5416,24,25,35,44,51,64,584,846,1980,2025};
        System.out.print("Enter the element that you want to search: ");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));
    }
}
