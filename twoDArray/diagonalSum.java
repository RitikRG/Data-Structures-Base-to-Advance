package twoDArray;

import arrays_pactise.repeatElement;

public class diagonalSum {
    public static int[] diagonalSum(int[][] matrix){
        int[] res={0,0};
        int row=0;
        int col=0;
        int primSum=0;
        while (row<matrix.length && col<matrix[0].length) {
            primSum+=matrix[row][col];
            row++;
            col++;
        }
        res[0]=primSum;

        row=0;
        col=matrix[0].length-1;
        int secSum=0;
        while (row<matrix.length && col>=0) {
            secSum+=matrix[row][col];
            row++;
            col--;
        }
        res[1]=secSum;
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Primary Diagonal Sum: "+diagonalSum(matrix)[0]);
        System.out.println("Secondary Diagonal Sum: "+diagonalSum(matrix)[1]);
    }
}
