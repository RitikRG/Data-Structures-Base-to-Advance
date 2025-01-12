package twoDArray;

import java.util.Arrays;

public class searchInSortedMatrix {
    public static int[] search(int[][] matrix, int target){
        int col=0;
        while (col<matrix[0].length-1) {
            if(matrix[0][col]==target){
                return new int[]{0,col};
            }else if(matrix[0][col]>target){
                col--;
                break;
            }
            col++;
        }
        int start=0;
        int end=matrix.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(matrix[mid][col]==target){
                return new int[]{mid,col};
            }else if(matrix[mid][col]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int[][] matrix2={{1}};
        System.out.println(Arrays.toString(search(matrix2,1)));
    }
}
