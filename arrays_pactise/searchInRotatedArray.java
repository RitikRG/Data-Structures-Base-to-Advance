package arrays_pactise;

public class searchInRotatedArray {
    public static int search(int[] arr, int target){
        // Find  the pivot point
        int pivot=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                pivot=i;
            }
        }
        int start;
        int end;
        if(pivot==-1){
            start=0;
            end=arr.length-1;
        }else{
            if(target>=arr[0]){
                start=0;
                end=pivot-1;
            }else{
                start=pivot;
                end=arr.length-1;
            }
        }
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
        int[] num={4,5,6,7,0,1,2};
        System.out.println(search(num,2));
    }
}
