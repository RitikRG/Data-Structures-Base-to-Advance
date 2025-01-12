package arrays_pactise;

public class maxSubarray {
    public static long maxSubarray(int arr[]){
        long maxSum=0;
        long currentSum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                currentSum+=arr[i];
            }else{
                currentSum=0;
            }
            if (currentSum>maxSum) {
                maxSum=currentSum;
            }
        }
        return maxSum;
    }
    public static long maxSubarraySum(int arr[]){
        long maxSum=0;
        for(int i=0;i<arr.length;i++){
            long currentSum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<0){
                    break;
                }
                currentSum+=arr[j];
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3,4,5,-3};
        System.out.println("Max subarray sum: "+maxSubarray(arr));
        System.out.println("Max subarray sum: "+maxSubarraySum(arr));
    }
}