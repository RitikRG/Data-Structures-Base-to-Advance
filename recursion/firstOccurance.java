package recursion;

public class firstOccurance {
    public static int firstOccur(int[] arr, int i, int target){
            if(i==arr.length){
                return -1;
            }
            if(arr[i]==target){
                return i;
            }
            return firstOccur(arr, i+1, target);
        }
        public static void main(String[] args) {
            int[] arr= {1,2,3,4,5,6,45,7,8,9,6};
            System.out.println(firstOccur(arr,0,445));
    }
}
