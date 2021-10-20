package lab2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob1_Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensionFirstMatrix = scanner.nextLine().split("\\s+");
        int rowFirstMatrix = Integer.parseInt(dimensionFirstMatrix[0]);
        int colFirstMatrix = Integer.parseInt(dimensionFirstMatrix[1]);
        int[][] firstMatrix = new int[rowFirstMatrix][];
        for (int row = 0; row < rowFirstMatrix; row++) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            firstMatrix[row] = array;
        }
        int[] dimensionSecondMatrix = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rowSecondMatrix = dimensionSecondMatrix[0];
        int colSecondMatrix = dimensionSecondMatrix[1];
        int[][] secondMatrix = new int[rowSecondMatrix][];
        for (int row = 0; row < rowSecondMatrix; row++) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            secondMatrix[row] = array;
        }
        if (areEqual(firstMatrix, secondMatrix, rowFirstMatrix, colFirstMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix
            , int rowFirstMatrix, int colFirstMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        } else {
            for (int row = 0; row < rowFirstMatrix; row++) {
                if (firstMatrix[row].length != secondMatrix[row].length) {
                    return false;
                } else {
                    for (int col = 0; col < colFirstMatrix; col++) {
                        if (firstMatrix[row][col] != secondMatrix[row][col]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
