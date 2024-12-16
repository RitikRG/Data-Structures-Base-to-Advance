package arrays_pactise;

public class trappingRainwater {
    public static long calcWater(int arr[]){
        long water = 0;
        for(int i=1; i<arr.length-1; i++){
            int leftMax=arr[i];
            int leftMaxIdx=i;
            int rightMax=arr[i];
            int rightMaxIdx=i;
            int j=i;
            while(j>=0){
                if(arr[j]>leftMax){
                    leftMax=arr[j];
                    leftMaxIdx=j;
                }
                j--;
            }
            j=i;
            while (j<arr.length) {
                if(arr[j]>rightMax){
                    rightMax=arr[j];
                    rightMaxIdx=j;
                }
                j++;
            }
            System.out.print(i+" "+leftMaxIdx+" "+rightMaxIdx);
            if(leftMaxIdx==i || rightMaxIdx==i){
                continue;
            }else{
                System.out.println(i);
                int waterLevel=0;
                if(leftMax<=rightMax){
                    waterLevel=leftMax;
                }else{
                    waterLevel=rightMax;
                }
                for(int k=leftMaxIdx+1;k<rightMaxIdx;k++){
                    water+=(waterLevel-arr[k]);
                }
                i=rightMaxIdx;
            }
            
        }
        return water;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(calcWater(arr));
    }
}
