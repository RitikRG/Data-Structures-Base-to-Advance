package arrays_pactise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class triplets {
    public static ArrayList<ArrayList<Integer> > findTriplets(int[] arr){
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ArrayList<Integer> trip = new ArrayList<>();
                        trip.add(arr[i]);
                        trip.add(arr[j]);
                        trip.add(arr[k]);
                        Collections.sort(trip);
                        if(!res.contains(trip)){
                            res.add(trip);
                        }
                        
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> res = findTriplets(nums);
        System.out.println(res);
    }
}
