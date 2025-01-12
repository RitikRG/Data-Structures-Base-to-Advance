package arrays_pactise;

public class largestInArray {
    public static void main(String[] args) {
        int arr[]={44,51,64,24,35,1980,584,25,2025,-5416,846};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The maximum value from the given array is: "+max);
    }
}
