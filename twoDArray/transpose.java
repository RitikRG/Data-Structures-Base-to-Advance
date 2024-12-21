package twoDArray;

import java.util.Arrays;

public class transpose {
    public static int[][] transpose(int[][] matrix){
        int[][] res =new int[matrix[0].length][matrix.length];
        int i=0;
        while (i<matrix.length) {
            int j=0;
            while (j<matrix[i].length) {
                res[j][i]=matrix[i][j];
                j++;
            }
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6}};
        matrix=transpose(matrix);
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }
}
