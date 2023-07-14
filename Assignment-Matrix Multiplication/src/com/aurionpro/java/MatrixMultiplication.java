package com.aurionpro.java;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrices
        System.out.print("Enter the number of rows for matrix A: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int n2 = scanner.nextInt();

        // Create matrices A and B with user-specified dimensions
        int[][] matrixA = new int[m1][n1];
        int[][] matrixB = new int[n1][n2];

        // Read values for matrix A
        System.out.println("Enter the values for matrix A:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Read values for matrix B
        System.out.println("Enter the values for matrix B:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Multiply matrices A and B
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result matrix
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int m1 = matrixA.length;
        int n1 = matrixA[0].length;
        int n2 = matrixB[0].length;

        int[][] resultMatrix = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }
}


    

