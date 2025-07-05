package Dsajava;

import java.util.Scanner;

class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tthr rows and coluns of matrix A");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        System.out.println("Enter tthr rows and coluns of matrix B");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();

        int[][] matA = new int[rowsA][colsA];
        int[][] matB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        if (colsA != rowsB) {
            return;
        }
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsA; j++) {
                matA[i][j] = sc.nextInt();
            }
        for (int i = 0; i < rowsB; i++)
            for (int j = 0; j < colsB; j++) {
                matB[i][j] = sc.nextInt();
            }

        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += matA[i][k] * matB[k][j];

        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
