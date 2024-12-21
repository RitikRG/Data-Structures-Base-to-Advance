package twoDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class spiralMatrix {
    public static void printSpiral(int[][] matrix) {
        int maxRow=matrix.length-1;
        int maxCol=matrix[0].length-1;
        int minCol=0;
        int minRow=0;
        int l = matrix[0].length*matrix.length;
        int count=0;
        while (minRow<=maxRow && minCol<=maxCol) {
            int i=minRow;
            int j=minCol;
            if (count==l) {
                break;
            }
            while(j<=maxCol){
                System.out.print(matrix[i][j]+" ");
                j++;
                count++;
            }
            j--;
            i++;
            if (count==l) {
                break;
            }
            while(i<=maxRow){
                System.out.print(matrix[i][j]+" ");
                i++;
                count++;
            }
            i--;
            j--;
            if (count==l) {
                break;
            }
            while(j>=minCol){
                System.out.print(matrix[i][j]+" ");
                j--;
                count++;
            }
            j++;
            i--;
            if (count==l) {
                break;
            }
            while(i>minRow){
                System.out.print(matrix[i][j]+" ");
                i--;
                count++;
            }
            minRow++;
            minCol++;
            maxRow--;
            maxCol--;
        }


    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        printSpiral(matrix);
        // for (int[] is : matrix) {
        //     System.out.println(Arrays.toString(is));
        // }
    }
}
