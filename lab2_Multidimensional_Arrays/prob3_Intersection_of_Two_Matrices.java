package lab2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob3_Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//row 3
//col 4
//a b c d
//a b c d
//a b c d
//k b c k
//a b g d
//a k c d
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];
        char[][] thirdMatrix = new char[rows][cols];
        firstMatrix = getMatrix(firstMatrix, rows, cols, scanner);
        secondMatrix = getMatrix(secondMatrix, rows, cols, scanner);
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                char currentChar;
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    currentChar = firstMatrix[row][col];
                } else {
                    currentChar = '*';
                }
                thirdMatrix[row][col] = currentChar;
            }
        }
        for (char[] matrix : thirdMatrix) {
            for (char e : matrix) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    private static char[][] getMatrix(char[][] matrix, int rows, int cols, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            String[] matrixElements = scanner.nextLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrixElements[j].charAt(0);
            }
        }
        return matrix;
    }
}
