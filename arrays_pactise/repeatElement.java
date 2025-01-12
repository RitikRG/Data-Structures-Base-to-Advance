package arrays_pactise;

public class repeatElement {
    public static boolean isRepeat(int[] arr){
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    return true;
                }
            }
            arr2[i]=arr[i];
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(isRepeat(arr));
    }
}
