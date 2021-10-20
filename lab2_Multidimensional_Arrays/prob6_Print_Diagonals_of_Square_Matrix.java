package lab2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob6_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[][] squareMatrix = new String[size][size];
        for (int row = 0; row < size; row++) {
            squareMatrix[row] = scanner.nextLine().split("\\s+");
        }
        int row = 0;
        int col = 0;
        while (row < size && col < size) {
            System.out.print(squareMatrix[row][col] + " ");
            row++;
            col++;
        }
        System.out.println();
        row = size - 1;
        col = 0;
        while (row >= 0 && col < size) {
            System.out.print(squareMatrix[row][col] + " ");
            row--;
            col++;
        }
    }
}
