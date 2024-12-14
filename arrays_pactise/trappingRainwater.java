package arrays_pactise;

public class trappingRainwater {
    public static long calcWater(int arr[]){
        for(int i=0; i<arr.length; i++){
            int j=i+1;
            while (arr[i]<arr[j]) {
                j++;
            }
            
        }
    }
    public static void main(String[] args) {
        
    }
}
