package com.stackroute.PE3;

// Method to calculate matrix addition

public class Matrix {

    public int[][] addMatrix(int rows,int columns, int[][] firstMatrix,int[][] secondMatrix)
    {

        int sum[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            return sum;
    }


}
