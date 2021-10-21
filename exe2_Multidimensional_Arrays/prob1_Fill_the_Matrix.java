package exe2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob1_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",\\s+");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[size][size];
        switch (pattern) {
            case "A":
                matrix = getMatrixA(matrix, size, scanner);
                break;
            case "B":
                matrix = getMatrixB(matrix, size, scanner);
                break;
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] e1 : matrix) {
            for (int e2 : e1) {
                System.out.print(e2 + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrixB(int[][] matrix, int size, Scanner scanner) {
        int counter = 1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = counter++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = counter++;
                }
            }
        }
        return matrix;
    }

    private static int[][] getMatrixA(int[][] matrix, int size, Scanner scanner) {
        int counter = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = counter++;
            }
        }
        return matrix;
    }
}
