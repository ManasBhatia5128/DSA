package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {
            {1,0,1},
            {1,1,0},
            {1,1,1}
        };
        better(arr);
        for (int[] elem : arr) {
            System.out.println(Arrays.toString(elem));
        }
    }

    static void brute(int[][] matrix){ // This iteration will obv go to O(smthg^3) from the loop structure
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 0){
                    markNegRow(matrix, i);
                    markNegCol(matrix, j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void markNegRow(int[][] matrix, int r){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[r][i] != 0){
                matrix[r][i] = 0;
            }
        }
    }
    static void markNegCol(int[][] matrix, int c){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][c] != 0){
                matrix[i][c] = 0;
            }
        }
    }


    static void better(int[][] matrix){
        // We use two arrays corresponding to rows and cols, and mark the arrays for if any 0 is found for n x m matrix
        // TC of 2 loops O(2mn)
        // SC = O(m+n)
        int n = matrix.length;
        int m = matrix[0].length;
        int[] rowArr = new int[n];
        int[] colArr = new int[m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(rowArr[i] == 1 || colArr[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void optimal(int[][] matrix){// Our line of thinking is to keep a track of the zeros in the matrix itself in order to get constant space complexity
        // There's however one element in common, to eliminate this problem we will take one col[0] variable extra
        // int col = 
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                
            }
        }
    }
}
